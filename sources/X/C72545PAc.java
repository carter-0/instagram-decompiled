package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.direct.ui.thumbnailgrid.ThumbnailGridView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PAc  reason: case insensitive filesystem */
public final class C72545PAc implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7DZ A01;

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r9, AnonymousClass7FW r10) {
        int i;
        ArrayList arrayList;
        ThumbnailGridView thumbnailGridView;
        C72572PBd pBd = (C72572PBd) r9;
        NYZ nyz = (NYZ) r10;
        AnonymousClass0iw r4 = this.A00;
        AnonymousClass7FE r5 = nyz.A01;
        ViewGroup viewGroup = pBd.A01;
        C3265577g.A06(JTO.A0D(r5.A05), viewGroup, r5, true);
        pBd.A05.setUrl(nyz.A00, r4);
        TextView textView = pBd.A04;
        textView.setText(nyz.A04);
        AnonymousClass7L2 r7 = r5.A03;
        boolean CU2 = nyz.CU2();
        0qQ.A0B(r7, 0);
        textView.setTextColor(AnonymousClass7FB.A04(r7, CU2).A06);
        String str = nyz.A03;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView2 = pBd.A03;
        if (isEmpty) {
            i = 8;
        } else {
            textView2.setText(str);
            textView2.setTextColor(AnonymousClass7FB.A04(r7, CU2).A05);
            i = 0;
        }
        textView2.setVisibility(i);
        C242553Us A012 = C3265577g.A01(viewGroup.getContext(), r5);
        C70459O7k o7k = pBd.A06;
        List<C72695PFz> list = nyz.A05;
        AnonymousClass77D A02 = C3265577g.A02(A012.A04());
        AnonymousClass77D A03 = C3265577g.A03(A012.A04());
        0qQ.A0B(r4, 3);
        if (list == null || list.isEmpty()) {
            thumbnailGridView = o7k.A00;
            arrayList = 0sn.A00;
        } else {
            arrayList = AnonymousClass7TG.A0r(list);
            for (C72695PFz A002 : list) {
                arrayList.add(A002.A00());
            }
            thumbnailGridView = o7k.A00;
        }
        thumbnailGridView.setThumbnailPreviews(arrayList, A02, A03, r4);
        this.A01.A02(pBd, nyz);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        this.A01.A01(r2);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.7X4, X.7XR, X.7XX] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72545PAc(X.AnonymousClass0iw r8, X.AnonymousClass7X4 r9, X.AnonymousClass9HC r10) {
        /*
            r7 = this;
            r7.<init>()
            r6 = r10
            boolean r1 = r10.A1X
            X.77j r0 = new X.77j
            r0.<init>(r1)
            X.P8D r2 = new X.P8D
            r5 = r9
            r2.<init>(r9, r7)
            X.77k r3 = r0.A00(r9)
            X.7DV r4 = new X.7DV
            r4.<init>(r9, r1)
            X.77l r1 = new X.77l
            r1.<init>(r2, r3, r4, r5, r6)
            X.7DY[] r0 = new X.AnonymousClass7DY[]{r1, r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            X.7DZ r0 = new X.7DZ
            r0.<init>(r1)
            r7.A01 = r0
            r7.A00 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72545PAc.<init>(X.0iw, X.7X4, X.9HC):void");
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.direct_profile_message);
        AnonymousClass7PV.A01(A0C);
        C72572PBd pBd = new C72572PBd(A0C);
        this.A01.A00(pBd);
        return pBd;
    }
}
