package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.FbV  reason: case insensitive filesystem */
public final class C50422FbV implements G8J {
    public final RecyclerView A00;
    public final FPM A01;
    public final C46845DmL A02;
    public final IgdsInlineSearchBox A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A02, new C73907Pli(this, 36));

    public C50422FbV(ViewGroup viewGroup, RecyclerView recyclerView, FPM fpm, UserSession userSession, IgdsInlineSearchBox igdsInlineSearchBox, 0sP r11) {
        0qQ.A0B(userSession, 1);
        AnonymousClass7TG.A0w(2, fpm, igdsInlineSearchBox, recyclerView);
        this.A01 = fpm;
        this.A03 = igdsInlineSearchBox;
        this.A00 = recyclerView;
        C46845DmL dmL = new C46845DmL(r11, userSession);
        this.A02 = dmL;
        View findViewById = viewGroup.findViewById(R.id.direct_recipients_selected_section);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        DbX.A1D(viewGroup, R.id.direct_metadata_header_container, 8);
        DbV.A1A(recyclerView.getContext(), recyclerView);
        dmL.setHasStableIds(true);
        recyclerView.setAdapter(dmL);
        recyclerView.setItemAnimator(new AnonymousClass4CS(new C73907Pli(this, 35)));
    }

    public static final void A01(C50422FbV fbV, C62320sa r5) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, DbX.A07(fbV.A04)});
        ofInt.setDuration(250);
        ofInt.addUpdateListener(new FHO(fbV, 1));
        ofInt.addListener(new C56672I7b(1, r5, fbV));
        ofInt.start();
    }

    public final void Dwm(List list) {
    }

    public final void EIM() {
    }

    public final void Eop(int i) {
    }

    public final void FM8(DirectShareTarget directShareTarget) {
    }

    public static final void A00(C50422FbV fbV) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{DbX.A07(fbV.A04), 0});
        ofInt.setDuration(250);
        ofInt.addUpdateListener(new FHO(fbV, 0));
        ofInt.addListener(new FHI(fbV, 5));
        ofInt.start();
    }

    public final void AHG() {
        this.A03.A02 = null;
    }

    public final boolean AHd() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
        if (!igdsInlineSearchBox.hasFocus()) {
            return false;
        }
        igdsInlineSearchBox.clearFocus();
        return true;
    }

    public final void AHt() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
        igdsInlineSearchBox.setTag("");
        G77 g77 = igdsInlineSearchBox.A02;
        if (g77 != null) {
            g77.onSearchCleared(igdsInlineSearchBox.getSearchString());
        }
        igdsInlineSearchBox.A0E.setText("");
        igdsInlineSearchBox.setTag((Object) null);
    }

    public final String BqO() {
        return this.A03.getSearchString();
    }

    public final boolean CJp() {
        return this.A03.hasFocus();
    }

    public final void CLU() {
        0nA.A0N(this.A03);
    }

    public final void DzK() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
        igdsInlineSearchBox.A02 = new Fd1(this, 5);
        igdsInlineSearchBox.A00 = new FPM(this, 6);
        igdsInlineSearchBox.setEditTextOnClickListener(FP8.A00(this, 53));
    }

    public final void EHP() {
        this.A03.requestFocus();
    }

    public final void EjT(String str) {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
        BackInterceptEditText backInterceptEditText = igdsInlineSearchBox.A0E;
        backInterceptEditText.setText(str);
        backInterceptEditText.requestFocus();
        Pattern pattern = 0mp.A01;
        igdsInlineSearchBox.setSelection(str.length());
    }

    public final void Eug() {
        0nA.A0S(this.A03);
    }

    public final void FLl(String str, List list, boolean z, boolean z2) {
        RecyclerView recyclerView = this.A00;
        Animation animation = recyclerView.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        if (!(!list.isEmpty()) || recyclerView.getVisibility() != 8) {
            int size = list.size();
            C46845DmL dmL = this.A02;
            boolean z3 = false;
            if (size > dmL.getItemCount()) {
                z3 = true;
            }
            DbW.A0z(dmL, list, dmL.A01);
            if (z3) {
                recyclerView.A0o(DbT.A02(list, 1));
            }
            if (z) {
                AHt();
                return;
            }
            return;
        }
        A01(this, new C51766G0l(this, str, list, z, z2));
    }
}
