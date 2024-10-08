package com.instagram.common.ui.widget.adapterlayout;

import X.0qQ;
import X.2Rw;
import X.AnonymousClass0fD;
import X.C322876wY;
import X.C323766y4;
import X.C323776y5;
import X.C3254772o;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ListAdapter;

public final class AdapterLinearLayout extends LinearLayout {
    public C323766y4 A00;
    public C3254772o A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdapterLinearLayout(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final void setAdapter(ListAdapter listAdapter, C322876wY r6) {
        0qQ.A0B(listAdapter, 0);
        C323766y4 r2 = this.A00;
        if (r2 == null) {
            r2 = new C323766y4(this);
            this.A00 = r2;
        }
        ListAdapter listAdapter2 = r2.A00;
        if (listAdapter2 != null && r2.A04) {
            r2.A04 = false;
            listAdapter2.unregisterDataSetObserver(r2.A06);
        }
        r2.A07.removeAllViews();
        r2.A00 = listAdapter;
        if (!r2.A04) {
            r2.A04 = true;
            listAdapter.registerDataSetObserver(r2.A06);
        }
        r2.A01 = r6;
        C323766y4.A00(r2, "adapter_set");
    }

    public final void setRecyclerViewAdapter(2Rw r4, C322876wY r5) {
        0qQ.A0B(r4, 0);
        C3254772o r2 = this.A01;
        if (r2 == null) {
            r2 = new C3254772o(this, r5);
            this.A01 = r2;
        }
        try {
            2Rw r1 = r2.A00;
            if (r1 != null) {
                r1.unregisterAdapterDataObserver(r2.A05);
            }
        } catch (Exception unused) {
        }
        r2.A00 = r4;
        r4.registerAdapterDataObserver(r2.A05);
        C3254772o.A00(r2);
    }

    public final void setIgnoreAdapterUpdates(boolean z) {
        C323766y4 r1 = this.A00;
        if (r1 != null) {
            r1.A03 = z;
            if (r1.A02 && !z) {
                C323766y4.A00(r1, "process_pending_updates");
            }
        }
        C3254772o r12 = this.A01;
        if (r12 != null) {
            r12.A02 = z;
            if (!z && r12.A01) {
                C3254772o.A00(r12);
                r12.A01 = false;
            }
        }
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(1508010855);
        super.onAttachedToWindow();
        C323766y4 r2 = this.A00;
        if (r2 != null) {
            ListAdapter listAdapter = r2.A00;
            if (listAdapter != null && !r2.A04) {
                r2.A04 = true;
                listAdapter.registerDataSetObserver(r2.A06);
            }
            if (r2.A07.getChildCount() == 0) {
                C323766y4.A00(r2, "attached_to_window");
            }
        }
        AnonymousClass0fD.A0D(-799287230, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-571349493);
        super.onDetachedFromWindow();
        C323766y4 r2 = this.A00;
        if (r2 != null) {
            ListAdapter listAdapter = r2.A00;
            if (listAdapter != null && r2.A04) {
                r2.A04 = false;
                listAdapter.unregisterDataSetObserver(r2.A06);
            }
            r2.A07.removeAllViews();
            C323776y5 r1 = r2.A08;
            r1.A01.clear();
            r1.A00.clear();
        }
        C3254772o r22 = this.A01;
        if (r22 != null) {
            try {
                2Rw r12 = r22.A00;
                if (r12 != null) {
                    r12.unregisterAdapterDataObserver(r22.A05);
                }
            } catch (Exception unused) {
            }
            r22.A04.removeAllViews();
        }
        this.A01 = null;
        AnonymousClass0fD.A0D(-1466344005, A06);
    }

    public AdapterLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdapterLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}
