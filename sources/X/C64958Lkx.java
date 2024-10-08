package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.gallery.Medium;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Lkx  reason: case insensitive filesystem */
public final class C64958Lkx implements AnonymousClass8ML {
    public final /* synthetic */ K5R A00;

    public final void D7a(Medium medium, Integer num) {
        String str;
        C309516Yo r1;
        Fragment A002;
        0s1 r2;
        int id;
        String str2;
        0qQ.A0B(medium, 0);
        if (medium.A05()) {
            K5R k5r = this.A00;
            k5r.requireActivity();
            0lg A0X = DbT.A0X(k5r.A04);
            0qQ.A0B(A0X, 1);
            str = "entryPoint";
            if (k5r.A01) {
                A002 = new K5Q();
                String str3 = medium.A0X;
                Integer num2 = k5r.A00;
                if (num2 != null) {
                    Bundle A0B = DbV.A0B(str3, 0);
                    A0B.putString("file_path", str3);
                    A0B.putString("source_media_id", (String) null);
                    A0B.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, C63131Krz.A00(num2));
                    A0B.putBoolean("from_create_btn", true);
                    A002.setArguments(A0B);
                    View view = k5r.mView;
                    if (view != null) {
                        r2 = new 0s1(k5r.getParentFragmentManager());
                        id = view.getId();
                        str2 = K5Q.__redex_internal_original_name;
                    } else {
                        return;
                    }
                }
            } else {
                String str4 = medium.A0X;
                Integer num3 = k5r.A00;
                if (num3 != null) {
                    K5Q A003 = LKV.A00(num3, str4, (String) null);
                    r1 = DbW.A0H(k5r, A0X);
                    r1.A09();
                    r1.A0B((Bundle) null, A003);
                    r1.A04();
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        } else if (medium.CeS()) {
            K5R k5r2 = this.A00;
            ((C60088JfU) k5r2.A03.getValue()).A00.Epw(medium);
            k5r2.requireActivity();
            0lg A0X2 = DbT.A0X(k5r2.A04);
            0qQ.A0B(A0X2, 1);
            str = "entryPoint";
            if (k5r2.A01) {
                Integer num4 = k5r2.A00;
                if (num4 != null) {
                    A002 = C63129Krx.A00(num4, (String) null, true);
                    View view2 = k5r2.mView;
                    if (view2 != null) {
                        r2 = new 0s1(k5r2.getParentFragmentManager());
                        id = view2.getId();
                        str2 = K5S.__redex_internal_original_name;
                    } else {
                        return;
                    }
                }
            } else {
                Integer num5 = k5r2.A00;
                if (num5 != null) {
                    K5S A004 = C63129Krx.A00(num5, (String) null, false);
                    r1 = DbW.A0H(k5r2, A0X2);
                    r1.A09();
                    r1.A0B((Bundle) null, A004);
                    r1.A04();
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        } else {
            return;
        }
        r2.A0D(A002, str2, id);
        r2.A00();
    }

    public final void DR4(Medium medium) {
    }

    public C64958Lkx(K5R k5r) {
        this.A00 = k5r;
    }

    public final void D7Z() {
        K5R k5r = this.A00;
        if (k5r.A01) {
            JTU.A0q(k5r, k5r.getParentFragmentManager());
        } else {
            DbT.A1J(k5r);
        }
    }
}
