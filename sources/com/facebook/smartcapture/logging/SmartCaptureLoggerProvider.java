package com.facebook.smartcapture.logging;

import android.content.Context;
import android.os.Parcelable;

public interface SmartCaptureLoggerProvider extends Parcelable {
    SmartCaptureLogger get(Context context);
}
