package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.K9r  reason: case insensitive filesystem */
public final class C61486K9r extends C231632rz {
    public AtomicBoolean A00 = new AtomicBoolean(false);
    public AtomicBoolean A01 = new AtomicBoolean(false);
    public final Context A02;
    public final UserSession A03;
    public final IngestSessionShim A04;
    public final Lr0 A05;
    public final L4U A06;
    public final MTF A07;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C61486K9r(Context context, UserSession userSession, IngestSessionShim ingestSessionShim, Lr0 lr0, L4U l4u, MTF mtf) {
        this.A02 = context;
        this.A03 = userSession;
        this.A05 = lr0;
        this.A07 = mtf;
        this.A04 = ingestSessionShim;
        this.A06 = l4u;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(-1319296891);
        MTF mtf = this.A07;
        LRm AXA = mtf.AXA();
        C61002Juy juy = C61002Juy.A09;
        if (AXA.A01(juy).A01 == LMN.A03.A01) {
            this.A01.getAndSet(true);
        }
        L8B l8b = (L8B) DbT.A0o(view);
        C65299Lqs lqs = new C65299Lqs(this.A02, this.A03, this.A04, this.A05, this.A06, mtf);
        l8b.A02.setText(2131960143);
        l8b.A03.A03(mtf.AXA().A01(juy), lqs);
        AnonymousClass0fD.A0A(-2019609349, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(1957839296);
        UserSession userSession = this.A03;
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.recipient_picker_add_to_fb_dating_story, viewGroup, false);
        L8B l8b = new L8B(inflate, userSession);
        ImageView imageView = l8b.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Resources resources = viewGroup.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams);
        TextView textView = l8b.A02;
        textView.setTextSize(0, AnonymousClass7TE.A01(resources, R.dimen.abc_text_size_menu_header_material));
        textView.setTypeface(AnonymousClass7TG.A0N(context));
        inflate.setTag(l8b);
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new C64292LYs(5, this, inflate));
        AnonymousClass0fD.A0A(5528663, A032);
        return inflate;
    }
}
