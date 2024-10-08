package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2sd  reason: invalid class name and case insensitive filesystem */
public final class C231922sd implements C231932se {
    public boolean A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public C231922sd(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r2, 2);
        this.A02 = userSession;
        this.A01 = r2;
    }

    /* renamed from: A00 */
    public final void ADo(2bv r2, AnonymousClass4UC r3, C254123ry r4) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 2);
        ADr(r2, r3, r4, (Map) null);
    }

    /* renamed from: A01 */
    public final void ADr(2bv r9, AnonymousClass4UC r10, C254123ry r11, Map map) {
        String str;
        ArrayList arrayList;
        ImageUrl imageUrl;
        ImmutableList copyOf;
        0qQ.A0B(r11, 0);
        AnonymousClass4V7 r4 = r10.A08;
        TextView textView = r11.A09;
        String str2 = r4.A09.A00;
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(SBF.A00(str2, map));
        textView.setVisibility(0);
        C283845Jo r0 = r4.A03;
        TextView textView2 = r11.A07;
        if (r0 != null) {
            String str3 = r0.A00;
            if (str3 == null) {
                str3 = "";
            }
            textView2.setText(SBF.A00(str3, map));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        r11.itemView.setVisibility(0);
        C283885Js r02 = r4.A08;
        if (r02 != null) {
            str = r02.A00;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            r11.A08.setVisibility(8);
        } else {
            TextView textView3 = r11.A08;
            textView3.setText(SBF.A00(str, map));
            textView3.setVisibility(0);
        }
        List list = r4.A0C;
        if (list == null || (copyOf = ImmutableList.copyOf((Collection) list)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(0Yv.A1E(copyOf, 10));
            Iterator it = copyOf.iterator();
            while (it.hasNext()) {
                arrayList.add(((C283905Ju) it.next()).A00);
            }
        }
        C283905Ju r7 = r4.A06;
        C283905Ju r1 = r4.A07;
        if (arrayList == null || arrayList.isEmpty()) {
            IgImageView igImageView = r11.A0A;
            if (AnonymousClass3HA.A00(igImageView.getContext()) && r7 != null) {
                imageUrl = r7.A00;
            } else if (r1 != null) {
                imageUrl = r1.A00;
            } else {
                igImageView.setVisibility(8);
                r11.A0B.setVisibility(8);
            }
            igImageView.setUrl(imageUrl, this.A01);
            igImageView.setVisibility(0);
            r11.A0B.setVisibility(8);
        } else {
            String str4 = r10.A0D;
            if (!0qQ.A0K(str4, r11.A03)) {
                r11.A03 = str4;
                r11.A0B.setImageUris(arrayList, this.A01.getModuleName());
            }
            r11.A0A.setVisibility(8);
            r11.A0B.setVisibility(0);
        }
        AnonymousClass4VG r03 = r4.A00;
        ImageView imageView = r11.A06;
        if (r03 != null) {
            imageView.setVisibility(0);
            AnonymousClass0fU.A00(new C71340Oip(r9, r10, r11), imageView);
        } else {
            imageView.setVisibility(8);
            this.A00 = true;
        }
        TextView textView4 = r11.A01;
        if (textView4 != null) {
            AnonymousClass4VG r2 = r4.A01;
            if (!(r2 == null || r2.A02 == AnonymousClass05K.A0N)) {
                String str5 = r2.A00.A00;
                if (str5 == null) {
                    str5 = "";
                }
                String A002 = SBF.A00(str5, map);
                if (A002 != null) {
                    textView4.setVisibility(0);
                    textView4.setText(A002);
                    AnonymousClass0fU.A00(new FNU(r9, r10, map), textView4);
                }
            }
            textView4.setVisibility(8);
        }
        TextView textView5 = r11.A02;
        if (textView5 != null) {
            AnonymousClass4VG r22 = r4.A02;
            if (!(r22 == null || r22.A02 == AnonymousClass05K.A0N)) {
                String str6 = r22.A00.A00;
                if (str6 == null) {
                    str6 = "";
                }
                String A003 = SBF.A00(str6, map);
                if (A003 != null) {
                    textView5.setText(A003);
                    textView5.setVisibility(0);
                    if (r9 != null) {
                        AnonymousClass0fU.A00(new FO0(r9, r10, this, map), textView5);
                        r9.DbK(r10);
                    }
                    return;
                }
            }
            textView5.setVisibility(8);
        }
        if (r9 == null) {
            return;
        }
        r9.DbK(r10);
    }

    public final View CrT(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.generic_v3_megaphone, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        inflate.setTag(new C254123ry(inflate));
        return inflate;
    }
}
