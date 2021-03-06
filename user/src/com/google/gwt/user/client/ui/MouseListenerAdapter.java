/*
 * Copyright 2006 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.user.client.ui;

/**
 * An adapter to simplify mouse event listeners that do not need all events
 * defined on the MouseListener interface.
 * 
 * @deprecated use {@link com.google.gwt.event.dom.client.MouseDownHandler},
 *             {@link com.google.gwt.event.dom.client.MouseUpHandler},
 *             {@link com.google.gwt.event.dom.client.MouseOverHandler},
 *             {@link com.google.gwt.event.dom.client.MouseMoveHandler}, and/or
 *             {@link com.google.gwt.event.dom.client.MouseOutHandler} instead
 */
@Deprecated
public class MouseListenerAdapter implements MouseListener {

  public void onMouseDown(Widget sender, int x, int y) {
  }

  public void onMouseEnter(Widget sender) {
  }

  public void onMouseLeave(Widget sender) {
  }

  public void onMouseMove(Widget sender, int x, int y) {
  }

  public void onMouseUp(Widget sender, int x, int y) {
  }
}
