package com.instagram.api.schemas;

import X.D52;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public interface IGAdScreenshotURLDataDict extends Parcelable {
    public static final D52 A00 = D52.A00;

    Integer BCu();

    IGProjectPortalInfoDict BPk();

    Integer CGY();

    IGAdScreenshotURLDataDictImpl F3t();

    TreeUpdaterJNI FHC();

    String getDominantColor();

    String getUrl();
}
