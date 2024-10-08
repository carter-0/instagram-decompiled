package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.C3035269k;
import X.C44066CUj;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.audio.AudioIntf;
import com.instagram.feed.audio.ImmutablePandoAudio;

public final class ImmutablePandoAudioNoteResponseInfo extends 17P implements AudioNoteResponseInfoIntf {
    public static final C3035269k CREATOR = new CTC(13);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudioNoteResponseInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final AudioIntf Adh() {
        return (AudioIntf) A04(1549039479, ImmutablePandoAudio.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.AudioNoteResponseInfoIntf, com.instagram.api.schemas.ImmutablePandoAudioNoteResponseInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C44066CUj.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BOB() {
        return A0h(642643451);
    }

    public final AudioNoteResponseInfo F0g() {
        return new AudioNoteResponseInfo(Adh().FDt(), A0h(642643451));
    }
}
