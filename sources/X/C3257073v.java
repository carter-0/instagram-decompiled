package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.base.BoundedLinearLayout;

/* renamed from: X.73v  reason: invalid class name and case insensitive filesystem */
public final class C3257073v extends C249703kE implements C328007Db, C328287Ef, C328017Dc, C3263976p, C328027Dd {
    public C70440O6r A00;
    public F0E A01;
    public AnonymousClass742 A02;
    public C49338Ett A03;
    public C49471EwC A04;
    public AnonymousClass746 A05;
    public AnonymousClass77G A06;
    public AnonymousClass745 A07;
    public AnonymousClass744 A08;
    public C328087Dj A09;
    public final FrameLayout A0A;
    public final C71662eb A0B;
    public final C71662eb A0C;
    public final C71662eb A0D;
    public final C71662eb A0E;
    public final C71662eb A0F;
    public final C71662eb A0G;
    public final C71662eb A0H;
    public final BoundedLinearLayout A0I;
    public final ImageView A0J;

    public final AnonymousClass77G A00() {
        AnonymousClass77G r1 = this.A06;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass77G r12 = new AnonymousClass77G((ViewStub) this.A0G.A01().requireViewById(R.id.content_gating_stub));
        this.A06 = r12;
        return r12;
    }

    public final AnonymousClass745 A01() {
        AnonymousClass745 r1 = this.A07;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass745 r12 = new AnonymousClass745(this.A0B.A01());
        this.A07 = r12;
        return r12;
    }

    public final AnonymousClass742 A02() {
        AnonymousClass742 r1 = this.A02;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass742 r12 = new AnonymousClass742(this.A0D.A01());
        this.A02 = r12;
        return r12;
    }

    public final AnonymousClass744 A03() {
        AnonymousClass744 r1 = this.A08;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass744 r12 = new AnonymousClass744(this.A0G.A01());
        this.A08 = r12;
        return r12;
    }

    public final void AHu() {
        AnonymousClass746 r0 = this.A05;
        if (r0 != null) {
            r0.AHu();
        }
    }

    public final ImageView Afl() {
        return this.A0J;
    }

    public final View BJd() {
        FrameLayout frameLayout = this.A0A;
        if (frameLayout == null) {
            return this.itemView;
        }
        return frameLayout;
    }

    public final C242553Us BKr() {
        AnonymousClass746 r0 = this.A05;
        if (r0 != null) {
            return r0.A00.A08;
        }
        return C242553Us.A02;
    }

    public final C328087Dj BY0() {
        return this.A09;
    }

    public final C242553Us BzG() {
        AnonymousClass746 r0 = this.A05;
        if (r0 != null) {
            return r0.A00.A09;
        }
        return C242553Us.A02;
    }

    public final void CsL(float f) {
        AnonymousClass746 r0 = this.A05;
        if (r0 != null) {
            r0.CsL(f);
        }
    }

    public final void EI5() {
        AnonymousClass746 r0 = this.A05;
        if (r0 != null) {
            r0.EI5();
        }
    }

    public final void Ehf(C242553Us r2) {
        AnonymousClass746 r0 = this.A05;
        if (r0 != null) {
            r0.Ehf(r2);
        }
    }

    public final void FHQ(int i) {
        AnonymousClass745 r1 = this.A07;
        if (r1 != null && r1.A00.getVisibility() == 0) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            this.A0A.getGlobalVisibleRect(rect);
            IgImageView igImageView = r1.A00;
            igImageView.getGlobalVisibleRect(rect2);
            C71090Oc5 A002 = C71090Oc5.A0C.A00(igImageView);
            int i2 = i + (rect2.top - rect.top);
            if (A002.A02) {
                AnonymousClass7PT.A00(A002.A07, i2);
            }
        }
    }

    public final void FM4(C242553Us r2, float f) {
        AnonymousClass746 r0 = this.A05;
        if (r0 != null) {
            r0.FM4(r2, f);
        }
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [X.2eb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v15, types: [X.2eb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v16, types: [X.2eb, java.lang.Object] */
    public C3257073v(View view, boolean z) {
        super(view);
        C71662eb r1;
        C71662eb r12;
        C71662eb r13;
        this.A0A = (FrameLayout) view.requireViewById(R.id.message_content_generic_xma_container);
        this.A0I = (BoundedLinearLayout) view.requireViewById(R.id.xma_bubble_container);
        if (z) {
            View requireViewById = view.requireViewById(R.id.header_container);
            ? obj = new Object();
            obj.A00 = requireViewById;
            r1 = obj;
        } else {
            r1 = new C71662eb((ViewStub) view.requireViewById(R.id.header_stub));
        }
        this.A0D = r1;
        if (z) {
            View requireViewById2 = view.requireViewById(R.id.media_container);
            ? obj2 = new Object();
            obj2.A00 = requireViewById2;
            r12 = obj2;
        } else {
            r12 = new C71662eb((ViewStub) view.requireViewById(R.id.media_stub));
        }
        this.A0G = r12;
        this.A0H = new C71662eb((ViewStub) view.requireViewById(R.id.thumbnail_grid_stub));
        if (z) {
            View requireViewById3 = view.requireViewById(R.id.caption_container);
            ? obj3 = new Object();
            obj3.A00 = requireViewById3;
            r13 = obj3;
        } else {
            r13 = new C71662eb((ViewStub) view.requireViewById(R.id.caption_stub));
        }
        this.A0B = r13;
        this.A0F = new C71662eb((ViewStub) view.requireViewById(R.id.iconic_entrypoints_world_info));
        this.A0E = new C71662eb((ViewStub) view.requireViewById(R.id.iconic_entrypoints_cta_button));
        this.A0C = new C71662eb((ViewStub) view.requireViewById(R.id.cta_list_stub));
        this.A0J = (ImageView) view.requireViewById(R.id.doubletap_heart);
        if (z) {
            A02();
            A03();
            A01();
        }
    }

    public final void EeT(C328087Dj r1) {
        this.A09 = r1;
    }
}
