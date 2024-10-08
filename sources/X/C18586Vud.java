package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.util.recyclerview.LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vud  reason: case insensitive filesystem */
public final class C18586Vud {
    public RecyclerView A00;
    public U9j A01;
    public C298705tt A02;
    public List A03 = new ArrayList();
    public View A04;
    public LinearLayoutManager A05;
    public final int A06;
    public final AnonymousClass0iw A07;
    public final 0xF A08;
    public final UserSession A09;
    public final C17829Vgi A0A;
    public final Hashtag A0B;
    public final String A0C;
    public final Context A0D;
    public final C17495VXy A0E;

    public C18586Vud(Context context, AnonymousClass0iw r3, 0xF r4, UserSession userSession, C17829Vgi vgi, Hashtag hashtag, String str, int i) {
        0qQ.A0B(userSession, 2);
        C51972G9s.A1E(hashtag, str);
        this.A0D = context;
        this.A09 = userSession;
        this.A0A = vgi;
        this.A07 = r3;
        this.A08 = r4;
        this.A0B = hashtag;
        this.A0C = str;
        this.A06 = i;
        this.A0E = new C17495VXy(r3, r4, userSession);
        0qQ.A0B(r4, 4);
        this.A01 = new U9j(r3, r4, userSession, vgi);
    }

    public final void A01(C71662eb r6) {
        0qQ.A0B(r6, 0);
        if (this.A03.isEmpty()) {
            r6.A02();
            return;
        }
        View A012 = r6.A01();
        this.A04 = A012;
        if (A012 != null) {
            r6.A03(0);
            Context context = this.A0D;
            DbT.A16(context, A012, 2Yu.A0H(context, R.attr.backgroundColorSecondary));
            RecyclerView A0I = DbT.A0I(A012, R.id.related_item_carousel_view);
            LinearLayoutManager linearLayoutManager = this.A05;
            LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 = new LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1(context, (Boolean) null);
            if (linearLayoutManager != null) {
                linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1.A1P(linearLayoutManager.A1M());
            }
            this.A05 = linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;
            A0I.setLayoutManager(linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1);
            A0I.A15(new UAq(A0I, this.A0E, this.A01));
            this.A00 = A0I;
            A00(this);
        }
    }

    public static final void A00(C18586Vud vud) {
        RecyclerView recyclerView;
        Context context;
        Resources resources;
        int i;
        View view = vud.A04;
        if (view != null && (recyclerView = vud.A00) != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (vud.A02 == C298705tt.WITH_IMAGE_AND_CONTEXT) {
                layoutParams.height = -2;
                view.requireViewById(R.id.related_items_title).setVisibility(0);
                context = vud.A0D;
                resources = context.getResources();
                i = R.dimen.abc_button_padding_horizontal_material;
            } else {
                context = vud.A0D;
                layoutParams.height = context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_margin_horizontal);
                DbX.A1B(view, R.id.related_items_title);
                resources = context.getResources();
                i = R.dimen.ad4ad_button_bottom_margin;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            recyclerView.setLayoutParams(layoutParams);
            int size = recyclerView.A12.size();
            while (true) {
                size--;
                if (-1 < size) {
                    recyclerView.A0n(size);
                } else {
                    JTP.A1D(recyclerView, AnonymousClass7TG.A02(context), dimensionPixelSize);
                    recyclerView.setAdapter(vud.A01);
                    return;
                }
            }
        }
    }
}
