/*
 * **********************************************************************
 *
 *  Copyright (C) 2010 - 2015
 *
 *  [Base.java]
 *  JACPFX Project (https://github.com/JacpFX/JacpFX/)
 *  All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS"
 *  BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  express or implied. See the License for the specific language
 *  governing permissions and limitations under the License.
 *
 *
 * *********************************************************************
 */
package org.jacpfx.api.workbench;

import org.jacpfx.api.component.Injectable;
import org.jacpfx.api.component.Perspective;
import org.jacpfx.api.context.JacpContext;
import org.jacpfx.api.launcher.Launcher;

import java.util.List;

/**
 * This Interface defines the basic root construct of an JACPFX application, it
 * has no dependencies to any UI
 *
 * @param <C> defines the roote node type
 * @param <L> defines the message listener type
 * @param <A> defines the basic message type
 * @param <M> defines the basic message type
 * @author Andy Moncsek
 */
public interface Base<C,L, A, M> {

    /**
     * Get perspective in workbench.
     *
     * @return a list of all perspective
     */
    List<Perspective<C,L, A, M>> getPerspectives();

    /**
     * Initialization sequence returns basic container to handle perspective.
     *
     * @param launcher for di container
     * @param root,    the UIToolkit root object
     */
    void init(final Launcher<?> launcher, final Object root);

    /**
     * Returns the component context object.
     *
     * @return the context object.
     */
    JacpContext<L, M> getContext();

    /**
     * Returns the component handle class, this is the users implementation of the component.
     *
     * @param <X>, the component mus be type of Injectable.
     * @return ComponentHandle, the component handle.
     */
    <X extends Injectable> X getComponentHandle();

    /**
     * Set the component handle class. This is the users implementation of the component.
     *
     * @param handle, the handle object is the user defined, annotated component.
     * @param <X>,    the component mus be type of Injectable.
     */
    <X extends Injectable> void setComponentHandle(final X handle);

}
