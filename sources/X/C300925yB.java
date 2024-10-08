package X;

import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;

/* renamed from: X.5yB  reason: invalid class name and case insensitive filesystem */
public final class C300925yB {
    public MediaUploadMetadata A00;
    public 1iA A01;
    public AnonymousClass3Q2 A02;
    public Float A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;

    public C300925yB(MediaUploadMetadata mediaUploadMetadata, 1iA r4, Float f, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        0qQ.A0B(mediaUploadMetadata, 10);
        this.A01 = r4;
        this.A04 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A09 = str4;
        this.A08 = str5;
        this.A03 = f;
        this.A02 = null;
        this.A06 = str6;
        this.A00 = mediaUploadMetadata;
        this.A0A = z;
        this.A0B = z2;
    }

    public static final void A00(C300925yB r3) {
        if (r3.A06 == null) {
            throw new IllegalStateException("Check failed.");
        } else if (r3.A05() && r3.A09 == null) {
            0wb.A04("DirectPendingMedia_isVideoAndVideoPathIsNull", "videoPath is expected to be non-null when isVideo=true", 1);
        }
    }

    public final float A01() {
        Float f = this.A03;
        if (f != null) {
            return f.floatValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean A05() {
        if (this.A01 == 1iA.A0a) {
            return true;
        }
        return false;
    }

    public final String A02() {
        String str;
        if (A05()) {
            str = this.A09;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            str = this.A07;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return str;
    }

    public final String A03() {
        if (!A05()) {
            String str = this.A07;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public final String A04() {
        if (A05()) {
            String str = this.A09;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public C300925yB() {
        this(new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false), (1iA) null, (Float) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false);
    }
}
