package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import com.instagram.user.model.User;

/* renamed from: X.FTl  reason: case insensitive filesystem */
public final class C50205FTl implements AnonymousClass9FE {
    public final int A00;
    public final Object A01;

    public C50205FTl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onError(Throwable th) {
        if (this.A00 == 0) {
            C46656Dib dib = (C46656Dib) this.A01;
            TextView textView = dib.A0F;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = dib.A02;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String string;
        C46478Dfh dfh;
        C46478Dfh dfh2 = (C46478Dfh) obj;
        switch (this.A00) {
            case 0:
                C46656Dib dib = (C46656Dib) this.A01;
                dib.A0U = dfh2;
                if (dib.A0q.A2K() || (dfh = dib.A0U) == null || TextUtils.isEmpty(dfh.A01)) {
                    dib.A02.setVisibility(8);
                } else {
                    String str = dib.A0U.A01;
                    dib.A02.setVisibility(0);
                    TextView A0d = AnonymousClass7TE.A0d(dib.A03, R.id.page_text);
                    if (A0d != null) {
                        A0d.setText(str);
                        FPC.A02(A0d, dib, 2);
                    }
                }
                if (2Ek.A01(dib.A0q) || AnonymousClass431.A00(dib.A0V)) {
                    int i = 0;
                    dib.A07.setVisibility(0);
                    TextView A0G = DbU.A0G(dib.A03, R.id.connect_business_page_text);
                    dib.A0G = A0G;
                    if (A0G != null) {
                        2eS.A01(A0G);
                    }
                    dib.A0p = (ImageWithTitleTextView) dib.A03.findViewById(R.id.confirm_your_page);
                    User user = dib.A0q;
                    if (!(user == null || dib.mView == null)) {
                        TextView textView = dib.A0G;
                        if (textView != null) {
                            C46478Dfh dfh3 = dib.A0U;
                            if (dfh3 != null && !dfh3.A04) {
                                string = dfh3.A02;
                                String str2 = dfh3.A01;
                                if (TextUtils.isEmpty(string)) {
                                    string = str2;
                                }
                            } else if (user.A1N() || C46656Dib.A0Q(dib)) {
                                boolean A0Q = C46656Dib.A0Q(dib);
                                CallerContext callerContext = C50143FRa.A00;
                                int i2 = 2131955123;
                                if (A0Q) {
                                    i2 = 2131956537;
                                }
                                string = dib.getString(i2);
                            } else {
                                C46478Dfh dfh4 = dib.A0U;
                                if (dfh4 == null) {
                                    string = null;
                                } else {
                                    string = dfh4.A02;
                                }
                            }
                            textView.setText(string);
                        }
                        ImageWithTitleTextView imageWithTitleTextView = dib.A0p;
                        if (imageWithTitleTextView != null) {
                            C46478Dfh dfh5 = dib.A0U;
                            if (dfh5 == null || dfh5.A04) {
                                i = 8;
                            }
                            imageWithTitleTextView.setVisibility(i);
                        }
                    }
                    View requireViewById = dib.A03.requireViewById(R.id.business_page);
                    C46656Dib.A05(requireViewById, dib);
                    FPC.A02(requireViewById, dib, 1);
                    return;
                }
                dib.A0F.setVisibility(8);
                return;
            case 1:
                0qQ.A0B(dfh2, 0);
                ESM esm = (ESM) this.A01;
                esm.A01 = dfh2;
                esm.setItems(ESM.A06(esm));
                return;
            default:
                E28 e28 = (E28) this.A01;
                String str3 = dfh2.A02;
                if (str3 != null) {
                    ShareLaterMedia shareLaterMedia = e28.A01;
                    if (shareLaterMedia != null) {
                        C48153EZv.A05.A06(shareLaterMedia, true);
                    }
                    e28.A02 = true;
                    AnonymousClass1Nd.A00(e28.A00).A00(new Lg5(str3, true, true));
                    return;
                }
                return;
        }
    }
}
