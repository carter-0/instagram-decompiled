package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.music.common.ui.LoadingSpinnerView;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

public final class HJZ extends C53081GiF {
    public static final String __redex_internal_original_name = "ClipsDraftsSeeAllListAdapter";
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final Activity A03;
    public final Context A04;
    public final Fragment A05;
    public final AnonymousClass72N A06;
    public final UserSession A07;
    public final C55714HmB A08 = new C55714HmB();
    public final C349317zw A09;
    public final 1Av A0A;
    public final K57 A0B;
    public final AnonymousClass0eM A0C = C51970G9q.A0n(this, 22);
    public final AnonymousClass0eM A0D = C51970G9q.A0n(this, 23);
    public final AnonymousClass0eM A0E = C51970G9q.A0n(this, 24);
    public final AnonymousClass0eM A0F = AnonymousClass0eN.A00(0eO.A02, new MMH(this, 25));
    public final AnonymousClass0eM A0G = C51970G9q.A0n(this, 26);
    public final boolean A0H = true;

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        HJY hjy;
        HJY hjy2;
        int i2;
        0qQ.A0B(viewGroup, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("ClipsDraftsSeeAllListAdapter.onCreateViewHolder", 2082136204);
        }
        if (i == 0) {
            IgdsListCell igdsListCell = new IgdsListCell(this.A04, (AttributeSet) null);
            igdsListCell.A06(2131955416);
            igdsListCell.setTextCellType(C69349Njo.TYPE_CHEVRON);
            igdsListCell.A05(R.drawable.instagram_clock_pano_outline_24);
            C56801ICy.A01(igdsListCell, 19, this);
            C249703kE r3 = new C249703kE(igdsListCell);
            hjy = r3;
            if (Systrace.A0E(1)) {
                i2 = 1039891918;
                hjy2 = r3;
            }
            return hjy;
        } else if (i == 1) {
            try {
                boolean A1b = G9t.A1b(this.A0G);
                int i3 = R.layout.gallery_drafts_list_item;
                if (A1b) {
                    i3 = R.layout.gallery_drafts_list_item_no_nested_layout;
                }
                View inflate = LayoutInflater.from(this.A04).inflate(i3, viewGroup, false);
                int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                UserSession userSession = this.A07;
                0qQ.A0A(inflate);
                HJY hjy3 = new HJY(inflate, userSession);
                AnonymousClass0fU.A00(new ID3((C53151GjN) hjy3, (C53081GiF) this, 4), hjy3.A05);
                AnonymousClass0fU.A00(new ID3((C53151GjN) hjy3, (C53081GiF) this, 5), hjy3.itemView);
                hjy = hjy3;
                if (Systrace.A0E(1)) {
                    i2 = 532895409;
                    hjy2 = hjy3;
                }
                return hjy;
            } catch (Throwable th) {
                if (Systrace.A0E(1)) {
                    0fS.A00(-1181120102);
                }
                throw th;
            }
        } else {
            throw DbW.A0b("Invalid view type ", i);
        }
        0fS.A00(i2);
        hjy = hjy2;
        return hjy;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HJZ(android.app.Activity r14, android.content.Context r15, androidx.fragment.app.Fragment r16, X.AnonymousClass72N r17, com.instagram.common.session.UserSession r18, X.C349317zw r19, X.K57 r20, int r21, int r22, boolean r23) {
        /*
            r13 = this;
            r8 = r18
            X.1Av r2 = X.1Au.A00(r8)
            r1 = 1
            r6 = r15
            X.AnonymousClass7TF.A1D(r8, r1, r15)
            r0 = 9
            r3 = r17
            X.0qQ.A0B(r3, r0)
            r0 = 11
            X.0qQ.A0B(r2, r0)
            r4 = r13
            r5 = r14
            r7 = r16
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A07 = r8
            r13.A05 = r7
            r13.A03 = r14
            r13.A04 = r15
            r0 = r19
            r13.A09 = r0
            r13.A0B = r9
            r13.A06 = r3
            r13.A0A = r2
            X.HmB r0 = new X.HmB
            r0.<init>()
            r13.A08 = r0
            r13.A0H = r1
            r0 = 24
            X.0eM r0 = X.C51970G9q.A0n(r13, r0)
            r13.A0E = r0
            r0 = 22
            X.0eM r0 = X.C51970G9q.A0n(r13, r0)
            r13.A0C = r0
            r0 = 26
            X.0eM r0 = X.C51970G9q.A0n(r13, r0)
            r13.A0G = r0
            r0 = 23
            X.0eM r0 = X.C51970G9q.A0n(r13, r0)
            r13.A0D = r0
            X.0eO r2 = X.0eO.A02
            r1 = 25
            X.MMH r0 = new X.MMH
            r0.<init>(r13, r1)
            X.0eM r0 = X.AnonymousClass0eN.A00(r2, r0)
            r13.A0F = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HJZ.<init>(android.app.Activity, android.content.Context, androidx.fragment.app.Fragment, X.72N, com.instagram.common.session.UserSession, X.7zw, X.K57, int, int, boolean):void");
    }

    public final void onBindViewHolder(C249703kE r19, int i) {
        JY5 jy5;
        String str;
        DateFormat dateFormat;
        int i2;
        C349317zw r1;
        C366978pz r0;
        Long l;
        String str2;
        int i3 = i;
        C249703kE r8 = r19;
        0qQ.A0B(r8, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("ClipsDraftsSeeAllListAdapter.onBindViewHolder", -1055571639);
        }
        try {
            if (getItemViewType(i3) == 1) {
                HJY hjy = (HJY) r8;
                if (this.A02) {
                    i3 = i - 1;
                }
                C369968vc r02 = (C369968vc) this.A0B.get(i3);
                0qQ.A0B(hjy, 0);
                0qQ.A0B(r02, 1);
                C369968vc r7 = hjy.A00;
                hjy.A00 = r02;
                LoadingSpinnerView loadingSpinnerView = hjy.A09;
                if (r02.A0F) {
                    jy5 = JY5.LOADING;
                } else {
                    jy5 = JY5.SUCCESS;
                }
                loadingSpinnerView.setLoadingStatus(jy5);
                IgImageView igImageView = hjy.A06;
                igImageView.setImageDrawable((Drawable) null);
                Context context = this.A04;
                igImageView.setPlaceHolderColor(AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_background));
                IQ8 iq8 = new IQ8(hjy);
                hjy.A02 = iq8;
                this.A08.A01(iq8, hjy.A00);
                hjy.A06.setVisibility(DbW.A01(hjy.A00.A0G ? 1 : 0));
                C369968vc r11 = hjy.A00;
                if (!0qQ.A0K(r7, r11)) {
                    hjy.A01 = null;
                }
                C53081GiF.A02(hjy, this);
                if (hjy.A01 == null) {
                    HWL.A00(this.A04, this.A07, AnonymousClass05K.A0Y).A02(this.A09.getViewLifecycleOwner(), r11.A09, new C59104J6m(46, (Object) hjy, (Object) r11, (Object) this));
                }
                TextView textView = hjy.A03;
                C369968vc r10 = hjy.A00;
                long j = r10.A01;
                long j2 = r10.A02;
                int i4 = ((j + 10000) > j2 ? 1 : ((j + 10000) == j2 ? 0 : -1));
                I4G i4g = I4G.A00;
                Activity activity = this.A03;
                if (i4 > 0) {
                    str = i4g.A01(activity, j);
                } else {
                    0qQ.A0B(activity, 0);
                    int intValue = I4G.A00(j2, System.currentTimeMillis()).intValue();
                    if (intValue != 0) {
                        if (intValue == 1) {
                            dateFormat = C51972G9s.A0P(activity).A01();
                            i2 = 2131955412;
                        } else if (intValue != 2) {
                            dateFormat = C51972G9s.A0P(activity).A03();
                            i2 = 2131955409;
                        } else {
                            dateFormat = C51972G9s.A0P(activity).A02();
                            i2 = 2131955411;
                        }
                        str = activity.getString(i2, new Object[]{dateFormat.format(new Date(j2))});
                    } else {
                        str = activity.getString(2131955410);
                    }
                    0qQ.A07(str);
                }
                textView.setText(str);
                TextView textView2 = hjy.A02;
                textView2.setText(hjy.A00.A0B);
                String str3 = hjy.A00.A0B;
                if (str3 == null || str3.length() <= 0) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                }
                AnonymousClass0eM r12 = this.A0D;
                boolean A1b = G9t.A1b(r12);
                TextView textView3 = hjy.A07;
                if (A1b) {
                    textView3.setVisibility(8);
                    hjy.A00.setVisibility(8);
                    textView3 = hjy.A04;
                    textView3.setVisibility(0);
                }
                textView3.setText(C347917xa.A01(hjy.A00.A00));
                if (G9t.A1b(this.A0C) && (l = hjy.A00.A06) != null) {
                    long longValue = l.longValue();
                    if (longValue > 0) {
                        if (G9t.A1b(r12)) {
                            hjy.A01.setVisibility(0);
                        }
                        TextView textView4 = hjy.A05;
                        textView4.setVisibility(0);
                        int i5 = (longValue > 1048576 ? 1 : (longValue == 1048576 ? 0 : -1));
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        double d = (double) longValue;
                        if (i5 <= 0) {
                            A1A.append(StringFormatUtil.formatStrLocaleSafe("%.1f", Double.valueOf(d / 1024.0d)));
                            str2 = " KB";
                        } else {
                            A1A.append(StringFormatUtil.formatStrLocaleSafe("%.1f", Double.valueOf(d / 1048576.0d)));
                            str2 = " MB";
                        }
                        textView4.setText(AnonymousClass7TF.A0l(str2, A1A));
                    }
                }
                if (i3 == 0 && !this.A01) {
                    View view = hjy.itemView;
                    0qQ.A06(view);
                    ImageView imageView = hjy.A05;
                    C369968vc r13 = hjy.A00;
                    int ordinal = ((C62469KgK) this.A0F.getValue()).ordinal();
                    if (ordinal == 0) {
                        1Av r6 = this.A0A;
                        if (!AnonymousClass7TG.A1a(r6, r6.A7I, 1Av.A8a, 271)) {
                            List list = (List) this.A06.A01.A02();
                            if (list == null || AnonymousClass7TE.A1b(list)) {
                                if (!this.A00) {
                                    C310336ap A0a = DbS.A0a();
                                    A0a.A0D = context.getText(2131955390);
                                    A0a.A01 = -1;
                                    A0a.A0L = true;
                                    DbW.A0q(context, A0a, 2131968772);
                                    C57276IVl.A00(A0a, this, 12);
                                    Drawable drawable = context.getDrawable(R.drawable.instagram_info_pano_outline_24);
                                    if (drawable != null) {
                                        A0a.A02();
                                        A0a.A08(drawable, context.getColor(R.color.igds_icon_on_color));
                                    }
                                    Dc2 A002 = A0a.A00();
                                    this.A02 = A002;
                                    DbX.A1S(A002);
                                    this.A00 = true;
                                }
                            }
                        }
                    } else if (ordinal != 1) {
                        throw AnonymousClass7TE.A1K();
                    } else if (r13.A04 != C2801950r.CLIPS || this.A0A.A01.getBoolean(AnonymousClass000.A00(1403), false) || !1KU.A0C(this.A07)) {
                        if (AnonymousClass7TF.A1Z(this.A0E) && !this.A0A.A01.getBoolean(AnonymousClass000.A00(4840), false) && !C319116q4.A07(this.A07)) {
                            r1 = this.A09;
                            r0 = C366978pz.A0W;
                        } else if (!this.A0A.A01.getBoolean(AnonymousClass000.A00(4839), false)) {
                            r1 = this.A09;
                            r0 = C366978pz.A0V;
                        }
                        r1.A01(view, imageView, r0);
                    } else {
                        this.A01 = this.A09.A01(view, imageView, C366978pz.A0X);
                    }
                }
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-975676355);
            }
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1487478599);
        int itemCount = super.getItemCount() + (this.A02 ? 1 : 0);
        AnonymousClass0fD.A0A(-770436305, A032);
        return itemCount;
    }

    public final long getItemId(int i) {
        long A002;
        int A032 = AnonymousClass0fD.A03(-162747003);
        if (getItemViewType(i) != 0) {
            if (this.A02) {
                i--;
            }
            A002 = super.getItemId(i);
        } else {
            A002 = this.A06.A00("0");
        }
        AnonymousClass0fD.A0A(-1519331509, A032);
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r4 != 0) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r4) {
        /*
            r3 = this;
            r0 = 2138163898(0x7f71caba, float:3.2139656E38)
            int r2 = X.AnonymousClass0fD.A03(r0)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x000e
            r1 = 0
            if (r4 == 0) goto L_0x000f
        L_0x000e:
            r1 = 1
        L_0x000f:
            r0 = 1606713447(0x5fc48067, float:2.831886E19)
            X.AnonymousClass0fD.A0A(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HJZ.getItemViewType(int):int");
    }
}
