package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MgF  reason: case insensitive filesystem */
public abstract class C66981MgF {
    public static final void A00(Context context, UserSession userSession, C267614bu r23, C66983MgH mgH, List list, boolean z) {
        C66982MgG mgG;
        int titleRes;
        Context context2;
        int i;
        Resources resources;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        C66983MgH mgH2 = mgH;
        List<C74507Pw2> list2 = list;
        AnonymousClass7TG.A0w(1, userSession2, mgH2, list2);
        C267614bu r20 = r23;
        0qQ.A0B(r20, 6);
        int size = list2.size();
        ImmutableList immutableList = mgH2.A00;
        if (immutableList == null || immutableList.size() != size) {
            ViewGroup viewGroup = mgH2.A01;
            viewGroup.removeAllViews();
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (int i2 = 0; i2 < size; i2++) {
                C66982MgG mgG2 = new C66982MgG(mgH2.itemView.getContext(), mgH2.A02);
                builder.add(mgG2);
                viewGroup.addView(mgG2);
            }
            mgH2.A00 = builder.build();
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C74507Pw2 pw2 : list2) {
            if (pw2 == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (!pw2.CQM(userSession2, (User) null)) {
                A1C.add(pw2);
            }
        }
        for (C74507Pw2 pw22 : list2) {
            if (pw22 == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (pw22.CQM(userSession2, (User) null)) {
                A1C.add(pw22);
            }
        }
        int size2 = A1C.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            C74507Pw2 pw23 = (C74507Pw2) A1C.get(i4);
            ImmutableList immutableList2 = mgH2.A00;
            if (!(immutableList2 == null || (mgG = (C66982MgG) 00k.A0O(immutableList2, i4)) == null)) {
                if (!pw23.Esw(context, userSession2)) {
                    mgG.setVisibility(8);
                } else {
                    mgG.setVisibility(0);
                    ImageView imageView = mgG.A01;
                    Context context3 = mgG.getContext();
                    imageView.setImageDrawable(context3.getDrawable(pw23.BEI()));
                    TextView textView = mgG.A03;
                    if (pw23.CQM(userSession2, (User) null)) {
                        titleRes = pw23.Apc();
                    } else {
                        titleRes = pw23.getTitleRes();
                    }
                    textView.setText(titleRes);
                    int C2e = pw23.C2e();
                    TextView textView2 = mgG.A02;
                    if (C2e == 2131952167) {
                        textView2.setText(context3.getString(2131952167, new Object[]{Long.valueOf(182.A01(0Tu.A05, userSession2, 36597064141966045L))}));
                    } else {
                        textView2.setText(C2e);
                    }
                    IgdsButton igdsButton = mgG.A04;
                    igdsButton.setText(pw23.Ait());
                    IgdsButton igdsButton2 = mgG.A05;
                    igdsButton2.setText(pw23.Apb());
                    igdsButton.setAlpha(pw23.Aii(userSession2));
                    igdsButton2.setAlpha(pw23.Aii(userSession2));
                    if (pw23.CQM(userSession2, (User) null)) {
                        igdsButton.setVisibility(8);
                        igdsButton2.setVisibility(0);
                        mgG.A00.setVisibility(0);
                        context2 = imageView.getContext();
                        i = R.attr.glyphColorPrimary;
                    } else {
                        igdsButton.setVisibility(0);
                        igdsButton2.setVisibility(8);
                        mgG.A00.setVisibility(8);
                        context2 = imageView.getContext();
                        i = R.attr.glyphColorProfileActivationCardIncomplete;
                    }
                    imageView.setImageTintList(ColorStateList.valueOf(2Yu.A0F(context2, i)));
                    if (mgG.A06) {
                        ViewGroup.LayoutParams layoutParams = igdsButton.getLayoutParams();
                        int i5 = C52440GSs.A00;
                        if (i5 == -1) {
                            int[] iArr = C52440GSs.A01;
                            TextPaint paint = igdsButton.A0A.getPaint();
                            int i6 = 0;
                            int i7 = 0;
                            do {
                                int i8 = iArr[i6];
                                resources = igdsButton.getResources();
                                String string = resources.getString(i8, new Object[]{0});
                                0qQ.A07(string);
                                i7 = Math.max(i7, (int) paint.measureText(string));
                                i6++;
                            } while (i6 < 2);
                            Context context4 = igdsButton.getContext();
                            0qQ.A07(context4);
                            i5 = Math.min(Math.max(0nA.A09(context4) / 3, resources.getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xxlarge)), i7);
                            C52440GSs.A00 = i5;
                        }
                        layoutParams.width = i5 + (igdsButton.getResources().getDimensionPixelSize(R.dimen.activation_row_button_padding) * 2);
                        igdsButton.setLayoutParams(layoutParams);
                    }
                    mgG.setButtonOnClickListener(new C71344Oit(i3, 9, pw23, userSession2));
                    int i9 = i3;
                    boolean z2 = z;
                    if (z) {
                        mgG.setDismissButtonOnClickListener(new C71360OjF(4, r20, pw23, userSession2, mgH2, mgG));
                    }
                    mgG.setDismissButtonVisibility(z2);
                    i3++;
                    0wc A01 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession2);
                    0Aj A00 = A01.A00(A01.A00, "ig_non_feed_activation_impression");
                    A00.AAJ("card_type", pw23.Beb());
                    A00.A9F("pos", Long.valueOf((long) i9));
                    A00.Cgf();
                }
            }
        }
    }
}
