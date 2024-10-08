package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.7zX  reason: invalid class name and case insensitive filesystem */
public final class C349067zX {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final LinearLayoutManager A05;
    public final C349087zZ A06;
    public final RecyclerView A07;
    public final AnonymousClass2t9 A08;
    public final boolean A09;
    public final C358978bm A0A;
    public final AnonymousClass2S0 A0B;

    public C349067zX(Context context, RecyclerView recyclerView, TargetViewSizeProvider targetViewSizeProvider, C358978bm r10, boolean z) {
        0qQ.A0B(context, 1);
        0qQ.A0B(targetViewSizeProvider, 4);
        this.A04 = context;
        this.A0A = r10;
        this.A07 = recyclerView;
        AnonymousClass2S0 r0 = AnonymousClass2S0.A01;
        0qQ.A07(r0);
        this.A0B = r0;
        this.A09 = 0mk.A02(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.A05 = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        C349077zY r02 = new C349077zY(targetViewSizeProvider, this);
        this.A06 = r02;
        Integer num = null;
        recyclerView.A0E = null;
        r02.A07(recyclerView);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new C349107zb(new C349097za(this)));
        AnonymousClass2t9 A003 = A002.A00();
        this.A08 = A003;
        recyclerView.setAdapter(A003);
        recyclerView.A15(new C349127zd(this));
        if (z) {
            Context context2 = this.A04;
            num = Integer.valueOf((context2.getResources().getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material) * 2) + context2.getResources().getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material));
        }
        C349137ze r1 = new C349137ze(this, num, ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K.getWidth());
        if (num != null) {
            recyclerView.A11(r1);
            A01(this, this.A00, true, false);
            A00(this);
        } else if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new AnonymousClass9SR(r1, this));
            return;
        } else {
            this.A07.A11(r1);
            if (!this.A01) {
                0nA.A0t(this.A07, new C41309Arp(this));
            }
        }
        this.A01 = true;
    }

    public static final void A00(C349067zX r5) {
        int i;
        RecyclerView recyclerView = r5.A07;
        recyclerView.A0i();
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new C349147zf(r5));
            return;
        }
        int i2 = -1;
        while (true) {
            int i3 = r5.A00;
            if (i2 < i3) {
                LinearLayoutManager linearLayoutManager = r5.A05;
                if (linearLayoutManager.A1D(i3) == null) {
                    i = linearLayoutManager.A1b();
                    if (i <= i2) {
                        return;
                    }
                } else {
                    i = r5.A00;
                }
                i2 = i;
                View A1D = linearLayoutManager.A1D(i);
                if (A1D != null) {
                    int[] A092 = r5.A06.A09(A1D, linearLayoutManager);
                    recyclerView.scrollBy(A092[0], A092[1]);
                }
            } else {
                return;
            }
        }
    }

    public static final void A01(C349067zX r15, int i, boolean z, boolean z2) {
        int i2 = r15.A00;
        int i3 = i;
        if (i2 != i3 || r15.A02) {
            if (z2 && i2 != i3) {
                r15.A0B.A05(10);
            }
            r15.A00 = i3;
            AnonymousClass2t9 r5 = r15.A08;
            List Au8 = r5.A04.Au8();
            0qQ.A07(Au8);
            ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
            int size = Au8.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = Au8.get(i4);
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.text.attribute.TextToolAttributeItemViewModel");
                C349117zc r6 = (C349117zc) obj;
                String str = r6.A06;
                String str2 = r6.A05;
                Drawable drawable = r6.A01;
                Typeface typeface = r6.A00;
                Float f = r6.A03;
                Float f2 = r6.A02;
                Float f3 = r6.A04;
                boolean z3 = false;
                if (i4 == r15.A00) {
                    z3 = true;
                }
                viewModelListUpdate.A00(new C349117zc(typeface, drawable, f, f2, f3, str, str2, z3));
            }
            r5.A05(viewModelListUpdate);
            r5.notifyDataSetChanged();
            r15.A0A.DML(r15.A00, z);
        }
    }
}
