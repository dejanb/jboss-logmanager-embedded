/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.logmanager;

import org.jboss.logging.LoggerPlugin;
import org.jboss.logging.MDCProvider;
import org.jboss.logging.MDCSupport;
import org.jboss.logging.NDCProvider;
import org.jboss.logging.NDCSupport;

/**
 * The JBoss Common Logging plugin implementation.
 */
public final class LoggerPluginImpl implements LoggerPlugin, NDCSupport, MDCSupport {

    private Logger logger;

    private static final String FQCN = org.jboss.logging.Logger.class.getName();

    /** {@inheritDoc} */
    public void init(final String name) {
        logger = Logger.getLogger(name);
    }

    /** {@inheritDoc} */
    public boolean isTraceEnabled() {
        return logger.isLoggable(Level.TRACE);
    }

    /** {@inheritDoc} */
    public void trace(final Object message) {
        logger.log(FQCN, Level.TRACE, String.valueOf(message), null);
    }

    /** {@inheritDoc} */
    public void trace(final Object message, final Throwable t) {
        logger.log(FQCN, Level.TRACE, String.valueOf(message), t);
    }

    /** {@inheritDoc} */
    public void trace(final String loggerFcqn, final Object message, final Throwable t) {
        logger.log(loggerFcqn, Level.TRACE, String.valueOf(message), t);
    }

    /** {@inheritDoc} */
    @Deprecated
    public boolean isDebugEnabled() {
        return logger.isLoggable(Level.DEBUG);
    }

    /** {@inheritDoc} */
    public void debug(final Object message) {
        logger.log(FQCN, Level.DEBUG, String.valueOf(message), null);
    }

    /** {@inheritDoc} */
    public void debug(final Object message, final Throwable t) {
        logger.log(FQCN, Level.DEBUG, String.valueOf(message), t);
    }

    /** {@inheritDoc} */
    public void debug(final String loggerFcqn, final Object message, final Throwable t) {
        logger.log(loggerFcqn, Level.DEBUG, String.valueOf(message), t);
    }

    /** {@inheritDoc} */
    @Deprecated
    public boolean isInfoEnabled() {
        return logger.isLoggable(Level.INFO);
    }

    /** {@inheritDoc} */
    public void info(final Object message) {
        logger.log(FQCN, Level.INFO, String.valueOf(message), null);
    }

    /** {@inheritDoc} */
    public void info(final Object message, final Throwable t) {
        logger.log(FQCN, Level.INFO, String.valueOf(message), t);
    }

    /** {@inheritDoc} */
    public void info(final String loggerFcqn, final Object message, final Throwable t) {
        logger.log(loggerFcqn, Level.INFO, String.valueOf(message), t);
    }

    /** {@inheritDoc} */
    public void warn(final Object message) {
        logger.log(FQCN, Level.WARN, String.valueOf(message), null);
    }

    /** {@inheritDoc} */
    public void warn(final Object message, final Throwable t) {
        logger.log(FQCN, Level.WARN, String.valueOf(message), t);
    }

    /** {@inheritDoc} */
    public void warn(final String loggerFcqn, final Object message, final Throwable t) {
        logger.log(loggerFcqn, Level.WARN, String.valueOf(message), t);
    }

    /** {@inheritDoc} */
    public void error(final Object message) {
        logger.log(FQCN, Level.ERROR, String.valueOf(message), null);
    }

    /** {@inheritDoc} */
    public void error(final Object message, final Throwable t) {
        logger.log(FQCN, Level.ERROR, String.valueOf(message), t);
    }

    /** {@inheritDoc} */
    public void error(final String loggerFcqn, final Object message, final Throwable t) {
        logger.log(loggerFcqn, Level.ERROR, String.valueOf(message), t);
    }

    /** {@inheritDoc} */
    public void fatal(final Object message) {
        logger.log(FQCN, Level.FATAL, String.valueOf(message), null);
    }

    /** {@inheritDoc} */
    public void fatal(final Object message, final Throwable t) {
        logger.log(FQCN, Level.FATAL, String.valueOf(message), t);
    }

    /** {@inheritDoc} */
    public void fatal(final String loggerFcqn, final Object message, final Throwable t) {
        logger.log(loggerFcqn, Level.FATAL, String.valueOf(message), t);
    }

    /** {@inheritDoc} */
    public NDCProvider getNDCProvider() {
        return NDCProviderImpl.getInstance();
    }

    /** {@inheritDoc} */
    public MDCProvider getMDCProvider() {
        return MDCProviderImpl.getInstance();
    }
}