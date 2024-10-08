package com.instagram.model.creation;

import X.C376399Hv;
import X.JWU;
import android.os.Parcelable;
import com.instagram.music.common.config.MusicAttributionConfig;
import java.util.List;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
public final class MediaCaptureConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(15);
    public MusicAttributionConfig A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.model.creation.MediaCaptureConfig.<init>(android.os.Parcel):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public MediaCaptureConfig(android.os.Parcel r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.model.creation.MediaCaptureConfig.<init>(android.os.Parcel):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.creation.MediaCaptureConfig.<init>(android.os.Parcel):void");
    }

    public final int describeContents() {
        return 0;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.model.creation.MediaCaptureConfig.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void writeToParcel(android.os.Parcel r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.model.creation.MediaCaptureConfig.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.creation.MediaCaptureConfig.writeToParcel(android.os.Parcel, int):void");
    }

    public MediaCaptureConfig(JWU jwu) {
        this.A0D = jwu.A05();
        this.A07 = jwu.A0C();
        this.A05 = jwu.A0A();
        this.A0C = jwu.A04();
        this.A03 = jwu.A08();
        this.A09 = jwu.A0E();
        this.A0A = jwu.A0F();
        this.A06 = jwu.A0B();
        this.A0B = jwu.A03();
        this.A00 = jwu.A00();
        this.A01 = jwu.A01();
        this.A02 = jwu.A02();
        this.A04 = jwu.A09();
        this.A0F = jwu.A07();
        this.A08 = jwu.A0D();
        this.A0E = jwu.A06();
    }
}
