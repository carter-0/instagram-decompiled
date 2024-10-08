package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

/* renamed from: X.GqZ  reason: case insensitive filesystem */
public final class C53563GqZ extends AnonymousClass0T0 implements YBO {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C53563GqZ(AudioOverlayTrack audioOverlayTrack, String str, List list) {
        AnonymousClass7TF.A1C(str, 1, list);
        this.A03 = str;
        this.A02 = audioOverlayTrack;
        this.A01 = list;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53563GqZ) || ((C53563GqZ) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!A00(1, obj)) {
                return false;
            }
            C53563GqZ gqZ = (C53563GqZ) obj;
            if (!0qQ.A0K(this.A03, gqZ.A03) || !0qQ.A0K(this.A02, gqZ.A02)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = gqZ.A01;
        } else if (this == obj) {
            return true;
        } else {
            if (!A00(0, obj)) {
                return false;
            }
            C53563GqZ gqZ2 = (C53563GqZ) obj;
            if (!0qQ.A0K(this.A03, gqZ2.A03) || !0qQ.A0K(this.A01, gqZ2.A01)) {
                return false;
            }
            obj2 = this.A02;
            obj3 = gqZ2.A02;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07;
        Object obj;
        int i;
        int i2 = this.A00;
        int A0O = AnonymousClass7TE.A0O(this.A03);
        if (i2 != 0) {
            A07 = AnonymousClass7TF.A07(this.A02, A0O);
            obj = this.A01;
        } else {
            A07 = AnonymousClass7TF.A07(this.A01, A0O);
            obj = this.A02;
            if (obj == null) {
                i = 0;
                return A07 + i;
            }
        }
        i = obj.hashCode();
        return A07 + i;
    }

    public C53563GqZ(ImageUrl imageUrl, 1Xj r3, String str) {
        this.A03 = str;
        this.A01 = r3;
        this.A02 = imageUrl;
    }
}
