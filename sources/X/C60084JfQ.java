package X;

import android.content.res.Resources;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.JfQ  reason: case insensitive filesystem */
public final class C60084JfQ extends 0ho {
    public int A00 = -1;
    public final SparseArray A01 = new SparseArray();
    public final UserSession A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new MMI(this, 24));
    public final FragmentActivity A04;
    public final C3507486a A05;

    public final int getItemPosition(Object obj) {
        JZ8 jz8;
        0qQ.A0B(obj, 0);
        if (obj.equals(K2T.A01)) {
            jz8 = JZ8.SCENE;
        } else if (obj.equals(K2U.A03)) {
            jz8 = JZ8.CAMERA_ROLL;
        } else if (!(obj instanceof C74568PxH)) {
            return -2;
        } else {
            jz8 = JZ8.GIF;
        }
        AnonymousClass0eM r1 = this.A03;
        if (JTO.A15(r1).contains(jz8)) {
            return JTO.A15(r1).indexOf(jz8);
        }
        return -2;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Object instantiateItem = C60084JfQ.super.instantiateItem(viewGroup, i);
        0qQ.A0C(instantiateItem, C273654mx.A00(8));
        this.A01.put(i, instantiateItem);
        return instantiateItem;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment A00(int r13) {
        /*
            r12 = this;
            X.0eM r0 = r12.A03
            java.util.List r0 = X.JTO.A15(r0)
            java.lang.Object r0 = X.00k.A0O(r0, r13)
            X.JZ8 r0 = (X.JZ8) r0
            if (r0 == 0) goto L_0x0076
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0070
            r0 = 0
            if (r1 == r0) goto L_0x0076
            r11 = 1
            if (r1 != r11) goto L_0x0076
            androidx.fragment.app.FragmentActivity r3 = r12.A04
            com.instagram.common.session.UserSession r1 = r12.A02
            X.86a r0 = r12.A05
            X.L7a r2 = new X.L7a
            r2.<init>(r3, r0, r1)
            com.instagram.common.session.UserSession r6 = r2.A02
            X.LqQ r7 = new X.LqQ
            r7.<init>(r2)
            X.NjK r8 = X.C69319NjK.REELS_GREEN_SCREEN
            X.0sn r10 = X.0sn.A00
            java.lang.String r9 = ""
            r5 = 0
            r0 = 23
            X.0qQ.A0B(r10, r0)
            X.NJc r4 = X.OPG.A01(r6, r7, r8, r9, r10, r11)
            X.9HD r1 = X.AnonymousClass9HC.A1b
            android.os.Parcelable$Creator r0 = com.instagram.direct.capabilities.Capabilities.CREATOR
            com.instagram.direct.capabilities.Capabilities r0 = X.C376189Gz.A00(r10)
            X.9HC r3 = r1.A00(r6, r0)
            androidx.fragment.app.FragmentActivity r2 = r2.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.7Kt r0 = X.C329927Kt.A00
            X.7L2 r0 = r0.A01(r2, r3, r5, r1)
            X.7L0 r0 = r0.A07
            r4.ADi(r0)
            X.0qQ.A0A(r4)
        L_0x005b:
            android.os.Bundle r0 = r4.mArguments
            if (r0 != 0) goto L_0x0066
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
            r4.setArguments(r0)
        L_0x0066:
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x006f
            com.instagram.common.session.UserSession r0 = r12.A02
            X.DbU.A1D(r1, r0)
        L_0x006f:
            return r4
        L_0x0070:
            X.K2T r4 = new X.K2T
            r4.<init>()
            goto L_0x005b
        L_0x0076:
            X.K2U r4 = new X.K2U
            r4.<init>()
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60084JfQ.A00(int):androidx.fragment.app.Fragment");
    }

    public final int getCount() {
        return DbS.A05(this.A03.getValue());
    }

    public final CharSequence getPageTitle(int i) {
        int ordinal;
        Resources resources;
        int i2;
        JZ8 jz8 = (JZ8) 00k.A0O(JTO.A15(this.A03), i);
        if (jz8 == null) {
            ordinal = -1;
        } else {
            ordinal = jz8.ordinal();
            if (ordinal == 2) {
                resources = this.A04.getResources();
                i2 = 2131963134;
                return AnonymousClass7TF.A0d(resources, i2);
            }
        }
        if (ordinal == 0) {
            if (182.A06(0Tu.A05, this.A02, 36327627958729289L)) {
                return "";
            }
            String string = this.A04.getResources().getString(2131963132);
            0qQ.A0A(string);
            return string;
        } else if (ordinal != 1) {
            return "";
        } else {
            resources = this.A04.getResources();
            i2 = 2131963133;
            return AnonymousClass7TF.A0d(resources, i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60084JfQ(FragmentActivity fragmentActivity, 0hq r4, C3507486a r5, UserSession userSession) {
        super(r4, 0);
        C51972G9s.A1C(userSession, r5);
        this.A02 = userSession;
        this.A04 = fragmentActivity;
        this.A05 = r5;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        DbY.A1S(viewGroup, obj);
        this.A01.remove(i);
        C60084JfQ.super.destroyItem(viewGroup, i, obj);
    }
}
