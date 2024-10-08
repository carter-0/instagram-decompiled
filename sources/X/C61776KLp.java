package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KLp  reason: case insensitive filesystem */
public final class C61776KLp extends C65059Lmd {
    public View A00;
    public View A01;
    public View A02;
    public final UserSession A03;
    public final AnonymousClass8II A04;
    public final C357968a9 A05;
    public final C60382Jkb A06;
    public final C63663L1z A07;
    public final 0sP A08;
    public final AnonymousClass4DH A09;
    public final boolean A0A;

    /* JADX WARNING: type inference failed for: r0v16, types: [X.07Z, X.4DH] */
    public final void CN3(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        RecyclerView A0F = DbZ.A0F(viewGroup, R.id.audio_filters_recycler_view);
        String str = "contentView";
        if (A0F != null) {
            this.A00 = A0F;
            View findViewById = viewGroup.findViewById(R.id.audio_filter_content);
            this.A00 = findViewById;
            if (findViewById != null) {
                this.A02 = findViewById.findViewById(R.id.audio_filter_play_pause_button);
                View view = this.A00;
                if (view != null) {
                    this.A01 = view.findViewById(R.id.audio_filter_done_button);
                    return;
                }
            }
        } else {
            View inflate = DbV.A0D(viewGroup).inflate(R.layout.layout_audio_filter_bottom_sheet, (ViewGroup) null, false);
            this.A00 = inflate;
            if (inflate != null) {
                RecyclerView A0F2 = DbZ.A0F(inflate, R.id.audio_filters_recycler_view);
                0qQ.A0B(A0F2, 0);
                this.A00 = A0F2;
                View view2 = this.A00;
                if (view2 != null) {
                    this.A02 = view2.findViewById(R.id.audio_filter_play_pause_button);
                    View view3 = this.A00;
                    if (view3 != null) {
                        View findViewById2 = view3.findViewById(R.id.audio_filter_done_button);
                        this.A01 = findViewById2;
                        if (findViewById2 == null) {
                            str = "doneButton";
                        } else {
                            LY4.A01(findViewById2, 2, this);
                            View view4 = this.A00;
                            if (view4 != null) {
                                viewGroup.addView(view4, new LinearLayout.LayoutParams(-1, -1));
                                A00().setLayoutManager(new GridLayoutManager(A00().getContext(), 3, 1, false));
                                A00().setAdapter(this.A06);
                                AnonymousClass8II r1 = this.A04;
                                if (r1 != null) {
                                    r1.A0B = true;
                                    r1.A0D = this.A0A;
                                    AnonymousClass11O.A03(AnonymousClass07a.A00(this.A09), JTO.A1I(MGV.A01(this, (AnonymousClass4D7) null, 2), r1.A0G));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C61776KLp(AnonymousClass4DH r3, UserSession userSession, AnonymousClass8II r5, C357968a9 r6, C63663L1z l1z, boolean z) {
        this.A09 = r3;
        this.A04 = r5;
        this.A07 = l1z;
        this.A0A = z;
        this.A05 = r6;
        this.A03 = userSession;
        MP5 A002 = MP5.A00(this, 8);
        this.A08 = A002;
        this.A06 = new C61773KLm(A002);
    }
}
