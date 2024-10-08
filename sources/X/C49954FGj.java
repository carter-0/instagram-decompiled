package X;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.FGj  reason: case insensitive filesystem */
public final class C49954FGj {
    public static final C49954FGj A00 = new Object();

    public static final void A02(Context context, C51946G8p g8p, C3034368u r6, C359628dE r7, C46619Dhz dhz, String str) {
        G9A g9a;
        Context context2 = context;
        0qQ.A0B(context, 0);
        G9A g9a2 = (G9A) C46604Dhk.A01(context);
        if (!(g9a2 instanceof 0SM) || (g9a = (0SM) g9a2) == null) {
            throw AnonymousClass7TE.A0z("Cannot push a new Screen without an existing bottom sheet.");
        }
        G9A g9a3 = g9a;
        X5M Bcw = g9a3.Bcw(C16501Uvx.Bloks);
        0qQ.A0C(Bcw, "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.intf.CdsBloksBottomSheetBehavior");
        g9a3.E5D(A01(context2, g8p, (C46601Dhh) Bcw, r6, r7, str), dhz);
    }

    public static final void A03(Context context, C307786Rm r4, C276544tV r5, C277014uI r6) {
        C51421Ftr ftr;
        0qQ.A0B(context, 0);
        G9A g9a = (G9A) C46604Dhk.A01(context);
        if (g9a != null) {
            if (r5 == null || r6 == null || r4 == null) {
                ftr = null;
            } else {
                ftr = new C51421Ftr(r4, r5, r6);
            }
            g9a.APb(new C48059EUd((Integer) null), ftr);
            return;
        }
        throw AnonymousClass7TE.A0z("Cannot dismiss without an existing bottom sheet.");
    }

    public static final void A04(Context context, C16399UuH uuH, String str) {
        0qQ.A0B(context, 0);
        G9A g9a = (G9A) C46604Dhk.A01(context);
        if (g9a == null) {
            throw AnonymousClass7TE.A0z("Cannot pop without an existing bottom sheet.");
        } else if (str == null) {
            g9a.E30(uuH);
        } else {
            g9a.E31(str);
        }
    }

    public static final C21043XAw A01(Context context, C51946G8p g8p, C46601Dhh dhh, C3034368u r15, C359628dE r16, String str) {
        C359628dE r11 = r16;
        C51946G8p g8p2 = g8p;
        0qQ.A0B(dhh, 1);
        String BVX = g8p.BVX();
        boolean equals = BVX.equals("screen_query");
        if (equals || BVX.equals("legacy_screen")) {
            Context context2 = context;
            if (equals) {
                0lg r3 = ((C359618dD) r11).A00;
                C50225FUh fUh = new C50225FUh(dhh);
                Fragment fragment = dhh.A0A;
                0qQ.A0C(fragment, "null cannot be cast to non-null type com.instagram.bloks.hosting.cds.IgCdsBottomSheetFragment");
                return new C14604TzA(context, (C18972WEz) g8p2, C229382nI.A02(fragment, fUh, r3, dhh.A09));
            } else if (BVX.equals("legacy_screen")) {
                String str2 = str;
                0qQ.A0B(str2, 1);
                C46602Dhi dhi = new C46602Dhi(new C299025uS(context), str2);
                SparseArray sparseArray = new SparseArray();
                sparseArray.put(R.id.cds_bottom_sheet_screen_data, dhi);
                0lg r32 = ((C359618dD) r11).A00;
                C50225FUh fUh2 = new C50225FUh(dhh);
                Fragment fragment2 = dhh.A0A;
                0qQ.A0C(fragment2, "null cannot be cast to non-null type com.instagram.bloks.hosting.cds.IgCdsBottomSheetFragment");
                C46583DhP A002 = C46583DhP.A00(context2, sparseArray, (C46645DiQ) g8p2, r15, C229382nI.A02(fragment2, fUh2, r32, dhh.A09), r11);
                A002.A08(context, dhh);
                G8K g8k = A002.A00;
                g8k.getClass();
                g8k.CmG("cds_bottomsheet", true);
                dhi.A00 = A002;
                return dhi;
            } else {
                throw DbZ.A0Z(BVX);
            }
        } else {
            throw DbW.A0c("Trying to create a CDS screen of an unknown type: ", BVX);
        }
    }

    public static final 0SM A00(C49954FGj fGj, String str, List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            G9A g9a = (Fragment) list.get(size);
            if (!(g9a instanceof G9A) || !(g9a instanceof 0SM)) {
                List A04 = g9a.getChildFragmentManager().A0U.A04();
                0qQ.A07(A04);
                0SM A002 = A00(fGj, str, A04);
                if (A002 != null) {
                    return A002;
                }
            } else {
                G9A g9a2 = (0SM) g9a;
                if (g9a2.AJd(str)) {
                    return g9a2;
                }
            }
            if (i < 0) {
                return null;
            }
            size = i;
        }
    }

    public static final void A05(0SM r5, FragmentActivity fragmentActivity, C51946G8p g8p, C3034368u r8, C359628dE r9, C14578Tyi tyi, String str) {
        0hq A0F = DbT.A0F(fragmentActivity);
        0s1 r0 = new 0s1(A0F);
        r0.A0I((String) null);
        try {
            r5.A0C(r0, (String) null);
        } catch (IllegalStateException e) {
            if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed() || A0F.A0G) {
                1Kn.A00((C307786Rm) null, "CDSBloksBottomSheetController", "Error attempting to show CDS fragment when activity is closing", e);
            } else {
                try {
                    A0F.A13();
                    0s1 r02 = new 0s1(A0F);
                    r02.A0I((String) null);
                    r02.A0B(r5, (String) null);
                    r02.A01();
                } catch (Exception e2) {
                    1Kn.A00((C307786Rm) null, "CDSBloksBottomSheetController", "Error attempting to show CDS fragment while allowing state loss during commit", e2);
                }
            }
        }
        C51545Fvr fvr = new C51545Fvr(r5, fragmentActivity, g8p, r8, r9, tyi, str);
        Handler A0D = AnonymousClass7TF.A0D();
        A0D.post(new TJX(A0D, r5, fvr));
    }
}
