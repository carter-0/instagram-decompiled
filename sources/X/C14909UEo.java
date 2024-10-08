package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.archive.fragment.ArchiveReelPeopleFragment;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.UEo  reason: case insensitive filesystem */
public final class C14909UEo extends C249703kE implements XC0 {
    public C19259WRs A00;
    public final ImageView A01;
    public final C338507i4 A02;
    public final ArchiveReelPeopleFragment A03;
    public final IgTextView A04;
    public final CircularImageView A05;
    public final CircularImageView A06;

    public final /* synthetic */ void Eui(boolean z) {
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.itemView);
    }

    public final RectF Beu() {
        return 0nA.A0F(this.itemView);
    }

    public final void CLk() {
        C51972G9s.A0I(this.itemView).start();
    }

    public final void Ev3() {
        this.itemView.animate().alpha(1.0f).start();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public C14909UEo(View view, ArchiveReelPeopleFragment archiveReelPeopleFragment) {
        super(view);
        this.A06 = DbU.A0X(view, R.id.user_avatar);
        this.A04 = DbT.A0a(view, R.id.username);
        ? A0X = DbU.A0X(view, R.id.darkening_overlay);
        this.A05 = A0X;
        ImageView A0F = DbU.A0F(view, R.id.user_loading_spinner);
        this.A01 = A0F;
        Context context = view.getContext();
        A0X.setImageDrawable(new ColorDrawable(Color.argb(100, 0, 0, 0)));
        C338507i4 r1 = new C338507i4(context);
        this.A02 = r1;
        r1.A00(0nA.A00(context, 2.0f));
        r1.A05(AnonymousClass7TE.A09(context));
        r1.A02(Paint.Cap.ROUND);
        A0F.setImageDrawable(r1);
        r1.start();
        this.A03 = archiveReelPeopleFragment;
        AnonymousClass3NG r12 = new AnonymousClass3NG(view);
        r12.A01(view);
        r12.A0C = true;
        r12.A07 = true;
        r12.A06 = false;
        r12.A04 = new C386359kT(this, 0);
        r12.A00();
    }
}
