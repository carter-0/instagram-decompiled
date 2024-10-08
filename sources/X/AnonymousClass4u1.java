package X;

import android.os.Parcelable;
import com.instagram.user.model.User;

/* renamed from: X.4u1  reason: invalid class name */
public final class AnonymousClass4u1 {
    /* JADX WARNING: type inference failed for: r2v3, types: [X.EtL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.EtK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.4uF, java.lang.Object] */
    public final Object A00(C276424tJ r5, String str, boolean z) {
        0qQ.A0B(str, 0);
        Object obj = null;
        if (!z) {
            int hashCode = str.hashCode();
            if (hashCode != -2035803845) {
                if (hashCode != -412315647) {
                    if (hashCode == 1306783860 && str.equals("ig.elements.alien_object.media")) {
                        ? obj2 = new Object();
                        r5.AwB();
                        1Xv r1 = 1Xj.A0h;
                        16F r0 = (16F) r5.AwB();
                        if (r0 != null) {
                            obj2.A00 = r1.A0B(r0);
                            obj = obj2;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else if (str.equals("ig.elements.alien_object.explore.hashtag")) {
                    Object AwB = r5.AwB();
                    ? obj3 = new Object();
                    obj3.A00 = C279594yt.parseFromJson((16F) AwB);
                    return obj3;
                }
            } else if (str.equals("ig.elements.alien_object.user")) {
                Object AwB2 = r5.AwB();
                Parcelable.Creator creator = User.CREATOR;
                16F r12 = (16F) AwB2;
                0qQ.A0B(r12, 0);
                User A00 = 1aC.A00(r12, false);
                if (A00 != null) {
                    ? obj4 = new Object();
                    obj4.A00 = A00;
                    return obj4;
                }
                1Kn.A02("IgBloksUserAlienObject", "DelegateParser in tokenizer for User was null.");
                return new Object();
            }
        }
        return obj;
    }
}
