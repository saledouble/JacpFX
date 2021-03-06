/*
 * **********************************************************************
 *
 *  Copyright (C) 2010 - 2015
 *
 *  [CSSUtil.java]
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
package org.jacpfx.rcp.util;

import javafx.scene.Node;

/**
 * The Class CSSUtil.
 *
 * @author Patrick Symmangk
 */
public class CSSUtil {

    /**
     * Sets the background color style to a given node.
     *
     * @param node  the node
     * @param color the color
     */
    public static void setBackgroundColor(Node node, String color) {
        node.setStyle("-fx-background-color:" + color + ';');
    }

    /**
     * Sets the background color to one ore more nodes.
     *
     * @param color the color
     * @param nodes the nodes
     */
    public static void setBackgroundColors(String color, Node... nodes) {
        for (final Node node : nodes) {
            setBackgroundColor(node, color);
        }
    }

    /**
     * Adds the css class to one or more nodes.
     *
     * @param className the class name
     * @param nodes     the nodes
     */
    public static void addCSSClass(final String className, Node... nodes) {
        for (final Node node : nodes) {
            node.getStyleClass().add(className);
        }
    }

    /**
     * Removes a css class from one or more nodes.
     *
     * @param className the class name
     * @param nodes     the nodes
     */
    public static void removeCSSClass(final String className, Node... nodes) {
        for (final Node node : nodes) {
            node.getStyleClass().remove(className);
        }
    }

    /**
     * Removes all given css classes from one node.
     *
     * @param node       the node
     * @param classNames the class names
     */
    public static void removeCSSClasses(Node node, String... classNames) {
        node.getStyleClass().remove(classNames);
    }

    public interface CSSClassConstants {
        // CLASSES
        String CLASS_DARK_BORDER                = "dark-border";
        String CLASS_WINDOW_BUTTONS             = "window-buttons";
        String CLASS_JACP_TOOL_BAR              = "jacp-tool-bar";
        String CLASS_JACP_BUTTON_BAR            = "jacp-button-bars";
        String CLASS_JACP_BREAD_CUMB            = "jacp-bread-crumb";
        String CLASS_JACP_BREAD_CRUMB_ITEM      = "jacp-bread-crumb-item";
        /* ***** OptionPane ***** */
        String CLASS_JACP_OPTION_PANE           = "jacp-option-pane";
        String CLASS_JACP_OPTION_PANE_BUTTON    = "jacp-option-pane-button";
        String CLASS_JACP_OPTION_PANE_PARENT    = "jacp-option-pane-parent";
        String CLASS_JACP_OPTION_PANE_MESSAGE   = "jacp-option-pane-message";
        String CLASS_JACP_OPTION_PANE_CLOSE     = "jacp-option-pane-close";
        String CLASS_JACP_OPTION_PANE_TITLE     = "jacp-option-pane-title";
        // HOVER MENU
        String CLASS_HOVER_MENU_TOP_ARROW       = "top-arrow";
        String CLASS_HOVER_MENU_BTM_ARROW       = "btm-arrow";
        String CLASS_HOVER_MENU_LFT_ARROW       = "lft-arrow";
        String CLASS_HOVER_MENU_RGT_ARROW       = "rgt-arrow";
        // Button
        String CLASS_HOVER_MENU_BUTTON          = "jacp-hovermenu-button";
        String CLASS_HOVER_MENU_PANE            = "jacp-hovermenu-pane";
    }

    public interface CSSIdConstants {
        // JACP TOOL BAR
        String ID_WINDOW_MIN                    = "window-min";
        String ID_WINDOW_MAX                    = "window-max";
        String ID_WINDOW_CLOSE                  = "window-close";
        // ROOT Layout
        String ID_ROOT                          = "root";
        String ID_ROOT_PANE                     = "root-pane";
        String ID_ERROR_DIMMER                  = "error-dimmer";
    }

    public interface GlobalValues {

        public static final double SINGLE_PADDING = 20;

    }

}
