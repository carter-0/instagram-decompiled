package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.HJb  reason: case insensitive filesystem */
public final class C54566HJb extends C53107Gif {
    public String A00 = "";
    public final View A01;
    public final RecyclerView A02;
    public final UserSession A03;
    public final IgSimpleImageView A04;
    public final IgTextView A05;
    public final AnonymousClass0eM A06 = C58709IwI.A00(this, 11);
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(C58580IuD.A00);
    public final AnonymousClass0eM A08 = C58709IwI.A00(this, 12);
    public final AnonymousClass0eM A09 = C58709IwI.A00(this, 13);
    public final C59586JPg A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54566HJb(View view, UserSession userSession, C59586JPg jPg) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A0A = jPg;
        this.A03 = userSession;
        this.A05 = DbX.A0Z(view, R.id.clips_template_browser_section_header);
        this.A04 = DbX.A0Y(view, R.id.more_info_icon);
        this.A02 = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.clips_template_browser_section_content);
    }

    public final void A00() {
        int A1c;
        C53152GjO gjO;
        View view = this.A01;
        if (view.getVisibility() == 0) {
            C59586JPg jPg = this.A0A;
            if (jPg.CbM(view) && (A1c = ((LinearLayoutManager) this.A09.getValue()).A1c()) != -1) {
                C249703kE A0W = this.A02.A0W(A1c);
                if (A0W == null || !(A0W instanceof C53152GjO)) {
                    gjO = null;
                } else {
                    gjO = (C53152GjO) A0W;
                }
                jPg.DHD(gjO);
            }
        }
    }
}
