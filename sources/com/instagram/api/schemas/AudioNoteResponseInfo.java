package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C44066CUj;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.audio.Audio;
import com.instagram.feed.audio.AudioIntf;

public final class AudioNoteResponseInfo extends AnonymousClass0T0 implements Parcelable, AudioNoteResponseInfoIntf {
    public static final Parcelable.Creator CREATOR = new SWT(55);
    public final Audio A00;
    public final String A01;

    public AudioNoteResponseInfo(Audio audio, String str) {
        0qQ.A0B(audio, 1);
        0qQ.A0B(str, 2);
        this.A00 = audio;
        this.A01 = str;
    }

    public final AudioNoteResponseInfo F0g() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioNoteResponseInfo) {
                AudioNoteResponseInfo audioNoteResponseInfo = (AudioNoteResponseInfo) obj;
                if (!0qQ.A0K(this.A00, audioNoteResponseInfo.A00) || !0qQ.A0K(this.A01, audioNoteResponseInfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public final /* bridge */ /* synthetic */ AudioIntf Adh() {
        return this.A00;
    }

    public final String BOB() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAudioNoteResponseInfo", C44066CUj.A00(this));
    }
}
