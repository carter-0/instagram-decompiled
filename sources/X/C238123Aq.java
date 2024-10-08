package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Aq  reason: invalid class name and case insensitive filesystem */
public class C238123Aq implements C238133Ar {
    public C231272rL A00;
    public C231272rL A01;
    public final C228442lg A02 = new C238153At(this);
    public final RecyclerView A03;
    public final List A04 = new ArrayList();

    public final int BCl() {
        return 0;
    }

    public final boolean CWN() {
        return false;
    }

    public final void EKm(Fragment fragment) {
        EKn(true);
    }

    public final void Ejl(int i) {
        Ejm(i, 0);
    }

    public final void Eq3(boolean z) {
        this.A03.setVerticalScrollBarEnabled(true);
    }

    public final void AAD(C249383je r2) {
        this.A03.A15(r2);
    }

    public final void AHq() {
        this.A03.A0b();
    }

    public final C231272rL AZK() {
        C231272rL r2 = this.A00;
        if (r2 == null && (r2 = this.A01) == null) {
            C231272rL r1 = this.A03.A0A;
            if (r1 instanceof C231272rL) {
                this.A00 = r1;
            } else if (r1 instanceof AnonymousClass2t9) {
                IW2 iw2 = new IW2(this);
                this.A01 = iw2;
                return iw2;
            }
        }
        return r2;
    }

    public final View AnC(int i) {
        return this.A03.getChildAt(i);
    }

    public final View AnE(int i) {
        RecyclerView recyclerView = this.A03;
        recyclerView.A0D.getClass();
        return recyclerView.A0D.A1D(i);
    }

    public final int AnH() {
        return this.A03.getChildCount();
    }

    public final int AyP() {
        if (this.A03.A12.size() <= 0) {
            return 0;
        }
        0KC.A0E("RecyclerViewProxy", "recyclerview doesn't support getDividerHeight with Item Decoration");
        return 0;
    }

    public final int B6L() {
        int A012;
        C252553pI r0 = this.A03.A0D;
        if (r0 == null || (A012 = C240113Jq.A01(r0)) == -1) {
            return 0;
        }
        return A012;
    }

    public final void B9Z(Rect rect) {
        this.A03.getGlobalVisibleRect(rect);
    }

    public final int BLQ() {
        int A022;
        C252553pI r0 = this.A03.A0D;
        if (r0 == null || (A022 = C240113Jq.A02(r0)) == -1) {
            return -1;
        }
        return A022;
    }

    public final int BLx(View view) {
        C249703kE A0Y = this.A03.A0Y(view);
        if (A0Y != null) {
            return A0Y.getLayoutPosition();
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ ViewGroup CEd() {
        return this.A03;
    }

    public final boolean COv() {
        return C2808154f.A04(this.A03);
    }

    public final boolean COw() {
        return C2808154f.A05(this.A03);
    }

    public final boolean CTr() {
        return this.A03.isFocused();
    }

    public final void EEZ(C249383je r2) {
        this.A03.A16(r2);
    }

    public final void EKn(boolean z) {
        RecyclerView recyclerView = this.A03;
        0qQ.A0B(recyclerView, 0);
        C252553pI r1 = recyclerView.A0D;
        if (!(r1 instanceof LinearLayoutManager) || ((LinearLayoutManager) r1).A1a() != -1) {
            C2808154f.A01(recyclerView, z);
        }
    }

    public final void ENw(C231272rL r3) {
        2Rw r0;
        RecyclerView recyclerView = this.A03;
        if (r3 == null) {
            r0 = null;
        } else {
            r0 = (2Rw) r3.getAdapter();
        }
        recyclerView.setAdapter(r0);
        this.A00 = r3;
    }

    public final void Ehv(IE9 ie9) {
        this.A03.A0H = ie9;
    }

    public final void Ejm(int i, int i2) {
        C252553pI r0 = this.A03.A0D;
        if (r0 != null) {
            C240113Jq.A05(r0, i, i2);
        }
    }

    public final void Evq(int i) {
        this.A03.A0p(i);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.52R, X.52T, X.52S] */
    public final void Evr(int i, int i2) {
        RecyclerView recyclerView = this.A03;
        C252553pI r2 = recyclerView.A0D;
        if (r2 != null) {
            ? r1 = new AnonymousClass52S(recyclerView.getContext());
            r1.A00 = -1.0f;
            r1.A01 = i2;
            r1.A00 = i;
            r2.A0t(r1);
        }
    }

    public final void EyK() {
        this.A03.A0l();
    }

    public final Context getContext() {
        return this.A03.getContext();
    }

    public final int getCount() {
        2Rw r0 = this.A03.A0A;
        if (r0 != null) {
            return r0.getItemCount();
        }
        return 0;
    }

    public final ViewParent getParent() {
        return this.A03.getParent();
    }

    public C238123Aq(RecyclerView recyclerView) {
        this.A03 = recyclerView;
    }

    public final void Evs(int i, int i2, int i3) {
        Evr(i, i2);
    }
}
