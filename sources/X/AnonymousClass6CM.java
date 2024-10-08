package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import com.instagram.feed.tifu.ui.VisibilityUpdateModifier;

/* renamed from: X.6CM  reason: invalid class name */
public abstract class AnonymousClass6CM {
    /* JADX WARNING: type inference failed for: r3v1, types: [com.instagram.barcelonaig.tixu.vpvd.VPVDElement, java.lang.Object, androidx.compose.ui.Modifier] */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.instagram.barcelonaig.tixu.vpvd.VisibilityChangeElement, java.lang.Object, androidx.compose.ui.Modifier] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.6CO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.instagram.barcelonaig.tixu.vpvd.VisibilityChangeElement, java.lang.Object, androidx.compose.ui.Modifier] */
    public static final Modifier A00(Modifier modifier, UserSession userSession, String str, 0sP r9, 0sP r10, 0sL r11) {
        Modifier Ezh;
        Integer num;
        0qQ.A0B(modifier, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(r11, 3);
        0qQ.A0B(r9, 4);
        0qQ.A0B(r10, 5);
        0Tu r3 = 0Tu.A05;
        boolean A06 = 182.A06(r3, userSession, 36326339469522655L);
        C285245Qk r5 = Modifier.A00;
        if (A06) {
            if (182.A06(r3, userSession, 36326339469588192L)) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A00;
            }
            C377619Mn r32 = new C377619Mn(str, r11, 5);
            C377609Mm r2 = new C377609Mm(str, r9, 25);
            C377609Mm r1 = new C377609Mm(str, r10, 26);
            0qQ.A0B(r5, 0);
            Ezh = new VisibilityUpdateModifier(num, r2, r1, r32);
        } else {
            0qQ.A0B(r5, 0);
            ? obj = new Object();
            obj.A00 = str;
            obj.A01 = r11;
            AnonymousClass6CN r22 = AnonymousClass6CN.A00;
            AnonymousClass9LZ r12 = new AnonymousClass9LZ(r9, 32);
            0qQ.A0B(obj, 0);
            0qQ.A0B(r22, 2);
            ? obj2 = new Object();
            obj2.A01 = str;
            obj2.A00 = r22;
            obj2.A02 = r12;
            Modifier Ezh2 = obj.Ezh(obj2);
            ? obj3 = new Object();
            AnonymousClass9LZ r13 = new AnonymousClass9LZ(r10, 33);
            0qQ.A0B(Ezh2, 0);
            ? obj4 = new Object();
            obj4.A01 = str;
            obj4.A00 = obj3;
            obj4.A02 = r13;
            Ezh = Ezh2.Ezh(obj4);
        }
        return modifier.Ezh(Ezh);
    }
}
