/**
* This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
*
* Do not edit this file as changes may cause incorrect behavior and will be lost
* once the code is regenerated.
*
* @generated by codegen project: GeneratePropsJavaDelegate.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;

public class FastImageViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & FastImageViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
  public FastImageViewManagerDelegate(U viewManager) {
    super(viewManager);
  }
  @Override
  public void setProperty(T view, String propName, @Nullable Object value) {
    switch (propName) {
      case "source":
        mViewManager.setSource(view, (ReadableMap) value);
        break;
      case "defaultSource":
        mViewManager.setDefaultSource(view, value == null ? null : (String) value);
        break;
      case "resizeMode":
        mViewManager.setResizeMode(view, (String) value);
        break;
      case "tintColor":
        mViewManager.setTintColor(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      default:
        super.setProperty(view, propName, value);
    }
  }
}
