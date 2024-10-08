package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Ngr  reason: case insensitive filesystem */
public final class C69193Ngr extends AnonymousClass7AK {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C70972OTt A01;
    public final /* synthetic */ C74476PvW A02;
    public final /* synthetic */ C67882MwQ A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69193Ngr(Context context, C70972OTt oTt, C74476PvW pvW, C67882MwQ mwQ, int i) {
        super(Integer.valueOf(i));
        this.A01 = oTt;
        this.A00 = context;
        this.A03 = mwQ;
        this.A02 = pvW;
    }

    public final void onClick(View view) {
        C70972OTt oTt = this.A01;
        oTt.A09 = false;
        Context context = this.A00;
        C67882MwQ mwQ = this.A03;
        ImageView imageView = mwQ.A00;
        DbU.A13(context, imageView, R.drawable.instagram_error_pano_outline_24);
        DbX.A12(context, imageView, 2Yu.A0B(context));
        mwQ.A01.setVisibility(0);
        mwQ.A02.setVisibility(8);
        this.A02.D5X(oTt);
    }
}
