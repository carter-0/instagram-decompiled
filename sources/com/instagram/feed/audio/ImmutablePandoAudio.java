package com.instagram.feed.audio;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44730Cjy;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DirectAudioFallbackUrl;
import com.instagram.api.schemas.DirectAudioFallbackUrlImpl;
import com.instagram.api.schemas.ImmutablePandoDirectAudioFallbackUrl;
import java.util.List;

public final class ImmutablePandoAudio extends 17P implements AudioIntf {
    public static final C3035269k CREATOR = CTA.A00(25);

    public final DirectAudioFallbackUrl B3k() {
        return (DirectAudioFallbackUrl) A05(761243362, ImmutablePandoDirectAudioFallbackUrl.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.audio.AudioIntf, com.instagram.feed.audio.ImmutablePandoAudio] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44730Cjy.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Adp() {
        return A0i(188526075);
    }

    public final Long Adq() {
        return A0L(-1148579917);
    }

    public final Long AzI() {
        return A0L(-1992012396);
    }

    public final List CGD() {
        return A0l(930261868);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.audio.ImmutablePandoAudio] */
    public final Integer CGE() {
        return getOptionalIntValueByHashCode(869042347);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.audio.ImmutablePandoAudio, X.17P] */
    public final Audio FDt() {
        DirectAudioFallbackUrlImpl directAudioFallbackUrlImpl;
        String A0i = A0i(188526075);
        Long A0L = A0L(-1148579917);
        Long A0L2 = A0L(-1992012396);
        DirectAudioFallbackUrl B3k = B3k();
        if (B3k != null) {
            directAudioFallbackUrlImpl = B3k.F2e();
        } else {
            directAudioFallbackUrlImpl = null;
        }
        return new Audio(directAudioFallbackUrlImpl, getOptionalIntValueByHashCode(869042347), A0L, A0L2, A0i, A0l(930261868));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.audio.ImmutablePandoAudio] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
