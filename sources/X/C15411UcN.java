package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.UcN  reason: case insensitive filesystem */
public final class C15411UcN extends C361158fl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C15411UcN(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj2;
        this.A03 = obj4;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public final void A02() {
        if (4 - this.A00 != 0) {
            super.A02();
            return;
        }
        U9i u9i = ((UZ2) this.A02).A06;
        u9i.A0A = true;
        u9i.notifyDataSetChanged();
    }

    public final void A04(C268654dm r4) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(r4, 0);
                ((AnonymousClass4D7) this.A02).resumeWith(new C297815sO(r4));
                return;
            case 3:
                return;
            case 4:
                if (((Fragment) this.A03).isResumed()) {
                    UZ2 uz2 = (UZ2) this.A02;
                    U9i u9i = uz2.A06;
                    u9i.A0A = false;
                    u9i.notifyItemChanged(1);
                    C59689JTv.A05(uz2.requireContext());
                    uz2.A08.dismiss();
                    return;
                }
                return;
            default:
                ((View) this.A04).setEnabled(true);
                C59689JTv.A07((Context) this.A01, 2131954189);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C46620Di0 A0Q;
        C229382nI A012;
        switch (this.A00) {
            case 0:
                A0Q = DbV.A0Q(obj);
                ((AnonymousClass4D7) this.A02).resumeWith(new C239793Ih(C60340gF.A00));
                FragmentActivity fragmentActivity = (Context) this.A03;
                DbS.A1X(fragmentActivity);
                A012 = C229382nI.A01((SparseArray) null, fragmentActivity, (AnonymousClass0iw) this.A01, (0lg) this.A04);
                break;
            case 3:
                C46620Di0 A0Q2 = DbV.A0Q(obj);
                FragmentActivity fragmentActivity2 = (Context) this.A02;
                DbS.A1X(fragmentActivity2);
                C48382Edd.A00(C229382nI.A01((SparseArray) null, fragmentActivity2, (AnonymousClass0iw) this.A01, (0lg) this.A04), A0Q2);
                ((C314466iJ) this.A03).DNE();
                return;
            case 4:
                C46620Di0 di0 = (C46620Di0) obj;
                0qQ.A0B(di0, 0);
                Fragment fragment = (Fragment) this.A03;
                if (fragment.isResumed()) {
                    C229382nI r4 = (C229382nI) this.A01;
                    UZ2 uz2 = (UZ2) this.A02;
                    r4.A01.put(R.id.info_center_refresh_callback, new WYR(fragment, (C17934ViP) this.A04, uz2));
                    C48382Edd.A00(r4, di0);
                    U9i u9i = uz2.A06;
                    u9i.A0A = false;
                    u9i.notifyItemChanged(1);
                    return;
                }
                return;
            default:
                A0Q = DbV.A0Q(obj);
                ((View) this.A04).setEnabled(true);
                A012 = C229382nI.A03((Fragment) this.A02, (0lg) this.A03, (2el) null);
                break;
        }
        C48382Edd.A00(A012, A0Q);
    }
}
