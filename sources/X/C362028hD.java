package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.8hD  reason: invalid class name and case insensitive filesystem */
public final class C362028hD implements C320536sX {
    public long A00;
    public AnonymousClass6ST A01;
    public C262204Co A02;
    public final View A03;
    public final AnonymousClass4DH A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new AnonymousClass9LD(this, 42));
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H = AnonymousClass0eN.A01(new AnonymousClass9LV(this, 2));
    public final AnonymousClass0eM A0I;
    public final C62320sa A0J;
    public final C357638Yz A0K;

    public C362028hD(View view, AnonymousClass4DH r10, AnonymousClass0iw r11, UserSession userSession, C357638Yz r13, C62320sa r14) {
        0qQ.A0B(view, 5);
        this.A04 = r10;
        this.A06 = userSession;
        this.A0K = r13;
        this.A05 = r11;
        this.A03 = view;
        this.A0J = r14;
        AnonymousClass9LD r7 = new AnonymousClass9LD(this, 48);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LV(new AnonymousClass9LV(r10, 4), 5));
        this.A0D = new C227862kA(new AnonymousClass9LV(A002, 6), r7, new AnonymousClass9M1(3, (Object) null, A002), new 0Yh(QuickSnapArchiveViewModel.class));
        this.A0F = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 0));
        this.A0I = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 3));
        this.A0G = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 1));
        this.A09 = AnonymousClass1YB.A00(new AnonymousClass9LD(this, 44));
        this.A0C = AnonymousClass1YB.A00(new AnonymousClass9LD(this, 47));
        this.A0B = AnonymousClass1YB.A00(new AnonymousClass9LD(this, 46));
        this.A0A = AnonymousClass1YB.A00(new AnonymousClass9LD(this, 45));
        this.A08 = AnonymousClass1YB.A00(new AnonymousClass9LD(this, 43));
        this.A0E = AnonymousClass1YB.A00(new AnonymousClass9LD(this, 49));
    }

    public static final void A00(IgSimpleImageView igSimpleImageView, C362028hD r3, boolean z) {
        Context context = r3.A04.getContext();
        if (context != null) {
            igSimpleImageView.setEnabled(z);
            int i = R.attr.igds_color_secondary_text_on_media;
            if (z) {
                i = R.attr.igds_color_primary_text_on_media;
            }
            int color = context.getColor(2Yu.A0H(context, i));
            TypedValue typedValue = AnonymousClass4Ed.A00;
            igSimpleImageView.setColorFilter(AnonymousClass37O.A00(color));
        }
    }

    public static final boolean A01(C362028hD r2) {
        if (r2.A0K.A08.A00 == AnonymousClass80K.A00) {
            return true;
        }
        return false;
    }

    public final void A02() {
        Object value;
        List list;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        Object value2 = this.A08.getValue();
        0qQ.A07(value2);
        ((View) value2).setVisibility(8);
        QuickSnapArchiveViewModel quickSnapArchiveViewModel = (QuickSnapArchiveViewModel) this.A0D.getValue();
        05G r7 = quickSnapArchiveViewModel.A0F;
        do {
            value = r7.getValue();
            C47177Drs drs = (C47177Drs) value;
            list = drs.A01;
            z = drs.A02;
            z2 = drs.A04;
            z3 = drs.A05;
            z4 = drs.A0B;
            z5 = drs.A07;
            z6 = drs.A06;
            i = drs.A00;
            0qQ.A0B(list, 0);
        } while (!r7.AIY(value, new C47177Drs(list, i, z, false, z2, false, false, false, z3, z4, z5, z6)));
        QuickSnapArchiveViewModel.A02(quickSnapArchiveViewModel);
        C262204Co r1 = this.A02;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        this.A02 = null;
    }

    public final C296915qr B9q(int i) {
        C296915qr B9q = ((C362428hs) this.A07.getValue()).B9q(i);
        0qQ.A07(B9q);
        return B9q;
    }
}
