package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.regex.Pattern;

public final class QEZ extends 2Rw {
    public final Context A00;
    public final E44 A01;
    public final UserSession A02;
    public final EffectAttribution.License[] A03;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r14, int i) {
        QEr qEr = (QEr) r14;
        EffectAttribution.License license = this.A03[i];
        E44 e44 = this.A01;
        UserSession userSession = this.A02;
        TextView textView = qEr.A03;
        textView.setText(license.mName);
        AnonymousClass0fU.A00(new C11498SbL(12, (Object) e44, (Object) userSession, (Object) license), textView);
        LinearLayout linearLayout = qEr.A02;
        linearLayout.removeAllViews();
        for (EffectAttribution.AttributedAsset attributedAsset : license.mAttributedAssets) {
            Context context = qEr.A00;
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-16777216);
            SpannableString spannableString = new SpannableString(DbV.A0u(context, attributedAsset.mTitle, attributedAsset.mAuthor, 2131953210));
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.blue_8));
            String str = attributedAsset.mTitle;
            Pattern pattern = 0mp.A00;
            spannableString.setSpan(foregroundColorSpan, 0, DbX.A05(str), 33);
            textView2.setText(spannableString, TextView.BufferType.SPANNABLE);
            AnonymousClass0fU.A00(new C11498SbL(13, (Object) e44, (Object) userSession, (Object) attributedAsset), textView2);
            linearLayout.addView(textView2);
        }
    }

    public QEZ(Bundle bundle, EffectAttribution effectAttribution, E44 e44) {
        this.A00 = e44.requireActivity().getApplicationContext();
        this.A01 = e44;
        this.A03 = effectAttribution.mLicenses;
        this.A02 = DbS.A0U(bundle);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(246959310);
        int length = this.A03.length;
        AnonymousClass0fD.A0A(1162920216, A032);
        return length;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.QEr, X.3kE] */
    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.effect_licensing_item);
        Context context = this.A00;
        ? r1 = new C249703kE(A0C);
        r1.A00 = context;
        r1.A01 = A0C;
        r1.A03 = DbU.A0G(A0C, R.id.license_title);
        r1.A02 = (LinearLayout) A0C.requireViewById(R.id.attributed_assets_container);
        return r1;
    }
}
