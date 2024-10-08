package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.ContentNotesOverflowFragmentUiState;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* renamed from: X.Gdy  reason: case insensitive filesystem */
public final class C52865Gdy extends BaseAdapter {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass4GS A02;
    public final C52976GgT A03;
    public final ContentNotesOverflowFragmentUiState A04;
    public final AnonymousClass33B A05;
    public final AnonymousClass4DU A06;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        return this.A04.A01.size();
    }

    public final Object getItem(int i) {
        return this.A04.A01.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        2V1 r0;
        LithoView lithoView;
        ComponentTree A002;
        UserSession userSession = this.A01;
        AnonymousClass4DU r13 = this.A06;
        C53810Gud gud = new C53810Gud(new C376459Ib((C62320sa) C58338IqJ.A00, (0sP) J21.A00, (0sP) J22.A00, 3), userSession, this.A02, this.A03, (NotesPogThoughtBubbleUiState) this.A04.A01.get(i), this.A05, r13);
        boolean A062 = 182.A06(DbS.A0J(userSession, 0), userSession, 2342163662151885571L);
        Context context = this.A00;
        if (A062) {
            AnonymousClass3X6 A022 = ComponentTree.A02(gud, r0, (AnonymousClass2TL) null);
            2Sa r02 = 2Sa.defaultInstance;
            0qQ.A0B(r02, 0);
            2Sa A012 = 2Sa.A01(r02);
            boolean z = A012.A0P;
            AnonymousClass3X7 r27 = A012.A02;
            2Sd r26 = A012.A03;
            2Sf r22 = A012.A01;
            Integer num = A012.A05;
            boolean z2 = A012.A0X;
            String str = A012.A07;
            boolean z3 = A012.A00;
            boolean z4 = A012.A09;
            boolean z5 = A012.A0J;
            boolean z6 = A012.A0C;
            boolean z7 = A012.A0A;
            boolean z8 = A012.A0L;
            boolean z9 = A012.A0T;
            Integer num2 = A012.A06;
            boolean z10 = A012.A0E;
            boolean z11 = A012.A0G;
            0sP r11 = A012.A08;
            boolean z12 = A012.A0W;
            boolean z13 = A012.A0I;
            boolean z14 = A012.A0F;
            boolean z15 = A012.A0H;
            boolean z16 = z2;
            A022.A06 = AnonymousClass3XC.A00(r22, A012, r27, r26, num, num2, str, r11, z4, z7, z6, A012.A0D, z10, z14, z11, z15, z3, z13, z5, z8, false, A012.A0N, z, z9, z12, z16);
            A002 = A022.A00();
            lithoView = new LithoView(new 2V1(context), (AttributeSet) null);
        } else {
            r0 = new 2V1(context);
            lithoView = new LithoView(r0, (AttributeSet) null);
            A002 = ComponentTree.A02(gud, r0, (AnonymousClass2TL) null).A00();
        }
        lithoView.A0k(A002, true);
        0qQ.A0A(lithoView);
        return lithoView;
    }

    public C52865Gdy(Context context, UserSession userSession, AnonymousClass4GS r3, C52976GgT ggT, ContentNotesOverflowFragmentUiState contentNotesOverflowFragmentUiState, AnonymousClass33B r6, AnonymousClass4DU r7) {
        C51972G9s.A1D(ggT, userSession);
        this.A00 = context;
        this.A04 = contentNotesOverflowFragmentUiState;
        this.A03 = ggT;
        this.A01 = userSession;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
    }
}
