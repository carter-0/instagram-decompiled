package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.UTt  reason: case insensitive filesystem */
public final class C15168UTt extends 2Th implements C251273mq {
    public static final C17752VeR A06 = new Object();
    public static final C253183qL A07 = new WJx();
    public static final WJy A08 = new WJy();
    public static final WK2 A09 = new WK2();
    public final C15172UTx A00;
    public final C307786Rm A01;
    public final C276544tV A02;
    public final C277014uI A03;
    public final long A04;
    public final C251273mq A05;

    public final boolean A0E() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        C51968G9o.A1D(linearLayout, -1);
        IgdsInlineSearchBox igdsInlineSearchBox = new IgdsInlineSearchBox(context, (AttributeSet) null, 0);
        igdsInlineSearchBox.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout.addView(igdsInlineSearchBox);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setItemAnimator((AnonymousClass3AS) null);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        DbV.A1B(context, recyclerView);
        linearLayout.addView(recyclerView);
        return linearLayout;
    }

    public final /* synthetic */ 2Ue D6k(int i) {
        return C246243eG.A00(this, i);
    }

    public final long A0H() {
        return this.A04;
    }

    public final C251273mq A0I() {
        return this.A05;
    }

    public final /* synthetic */ boolean AFh() {
        return false;
    }

    public final /* synthetic */ 2Sd Bdg() {
        return C243983aS.A00;
    }

    public final /* synthetic */ int E2z() {
        return 3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15168UTt(C15172UTx uTx, C307786Rm r7, C276544tV r8, long j) {
        super(AnonymousClass05K.A01);
        AnonymousClass7TG.A1O(r7, uTx);
        this.A01 = r7;
        this.A00 = uTx;
        this.A02 = r8;
        this.A03 = r8.A0A(38);
        C244233ar[] r2 = {C244753bh.A00(A07, this), C244753bh.A00(A08, this), C244753bh.A00(A09, this), C244753bh.A00(new C308096Sr(j), this)};
        int i = 0;
        do {
            A0D(r2[i]);
            i++;
        } while (i < 4);
        this.A04 = j;
        this.A05 = this;
    }

    public final /* synthetic */ Object Bdd() {
        return getClass();
    }
}
