package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.Jq4  reason: case insensitive filesystem */
public final class C60715Jq4 extends RecyclerView implements View.OnClickListener {
    public int A00 = -1887089959;
    public C64168LRo A01;
    public C66501MUf A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60715Jq4(Context context) {
        super(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        this.A03 = of;
        DbV.A1A(context, this);
        setAdapter(new C60385Jke(this, this));
        Resources resources = getResources();
        int A032 = JTP.A03(resources) + resources.getDimensionPixelSize(R.dimen.afi_margin_top);
        setClipToPadding(false);
        setPadding(A032, 0, A032, 0);
    }

    public void setBlurIconCache(C64168LRo lRo) {
        0qQ.A0B(lRo, 0);
        this.A01 = lRo;
    }

    public final void setEffectInfos(List list) {
        0qQ.A0B(list, 0);
        this.A03 = list;
    }

    public void setEffects(List list, boolean z, UserSession userSession) {
        0qQ.A0B(list, 0);
        this.A03 = list;
        this.A04 = z;
    }

    public void setFilterLogger(C63912LBx lBx) {
    }

    private final int A00(C60060Jeb jeb) {
        List list = this.A03;
        for (Object next : list) {
            C66568MWw mWw = jeb.A05.A01;
            0qQ.A07(mWw);
            if (0qQ.A0K(next, mWw)) {
                return list.indexOf(next);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void A1I(int i) {
        C252553pI r0 = this.A0D;
        View view = null;
        if (r0 == null || r0.A1D(i) == null) {
            A15(new C60469Jm1(this, i));
            A0p(i);
            return;
        }
        C66501MUf mUf = this.A02;
        if (mUf != null) {
            C252553pI r02 = this.A0D;
            if (r02 != null) {
                view = r02.A1D(i);
            }
            0qQ.A0C(view, "null cannot be cast to non-null type com.instagram.creation.base.ui.feedcolorfilterpicker.TileFrame");
            mUf.Drd((C60060Jeb) view, false);
        }
    }

    public final List getEffectInfos() {
        return this.A03;
    }

    public List getTileFrames() {
        List A07 = C242173Sx.A07(new AnonymousClass044(this));
        0qQ.A0C(A07, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.creation.base.ui.feedcolorfilterpicker.TileFrame>");
        return A07;
    }

    public void setRestoreSelectedIndex(int i) {
        post(new M6A(this, i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            r0 = -1954946985(0xffffffff8b79e057, float:-4.812443E-32)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.base.ui.feedcolorfilterpicker.TileFrame"
            X.0qQ.A0C(r6, r0)
            X.Jeb r6 = (X.C60060Jeb) r6
            r3 = 1
            int r2 = r6.getLeft()
            int r0 = r6.getWidth()
            int r2 = r2 - r0
            int r0 = r5.getPaddingLeft()
            int r2 = r2 + r0
            int r1 = r6.getRight()
            int r0 = r6.getWidth()
            int r1 = r1 + r0
            int r0 = r5.getWidth()
            int r1 = r1 - r0
            int r0 = r5.getPaddingLeft()
            int r1 = r1 + r0
            if (r1 <= 0) goto L_0x0049
            int r0 = r5.A00(r6)
            int r0 = r0 + 1
        L_0x0038:
            r5.A0p(r0)
        L_0x003b:
            X.MUf r0 = r5.A02
            if (r0 == 0) goto L_0x0042
            r0.Drd(r6, r3)
        L_0x0042:
            r0 = 1548598923(0x5c4dbe8b, float:2.31647498E17)
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0049:
            if (r2 >= 0) goto L_0x003b
            int r0 = r5.A00(r6)
            if (r0 <= 0) goto L_0x003b
            int r0 = r0 + -1
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60715Jq4.onClick(android.view.View):void");
    }

    public void setFilterListener(C66501MUf mUf) {
        this.A02 = mUf;
    }

    public final void setForcedDarkModeEnabled(boolean z) {
        this.A04 = z;
    }

    public void setShouldUseBlurIcons(boolean z) {
        this.A05 = z;
    }

    public void setShowOverlayText(boolean z) {
        this.A06 = z;
    }
}
