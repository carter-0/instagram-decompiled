package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2sI  reason: invalid class name and case insensitive filesystem */
public final class C231752sI extends C231632rz {
    public static String A05 = "v1";
    public C2363633l A00;
    public final C230192p8 A01;
    public final Context A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;

    public C231752sI(Context context, UserSession userSession, AnonymousClass4DU r4, C230192p8 r5) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r5, 4);
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = r4;
        this.A01 = r5;
    }

    public final String getBinderGroupName() {
        return "FeedSurvey";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return ((WWP) obj).getId().hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 5;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Throwable th;
        int i2;
        C230192p8 r15;
        Object obj3 = obj2;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(19582040);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0B(obj4, 2);
        0qQ.A0B(obj3, 3);
        WWP wwp = (WWP) obj4;
        C57251IUm iUm = (C57251IUm) obj3;
        int i3 = i;
        if (i == 0) {
            AnonymousClass4DU r10 = this.A04;
            Object tag = view2.getTag();
            if (tag != null) {
                A7E a7e = (A7E) tag;
                r15 = this.A01;
                0qQ.A0B(a7e, 1);
                0qQ.A0B(wwp, 2);
                0qQ.A0B(r15, 4);
                C15039UKs uKs = wwp.A01;
                User user = uKs.A01;
                View view3 = a7e.A00;
                if (user == null) {
                    view3.setVisibility(8);
                } else {
                    view3.setVisibility(0);
                    SpannableString spannableString = new SpannableString(user.getUsername());
                    TextView textView = a7e.A03;
                    String string = textView.getResources().getString(2131954110);
                    0qQ.A07(string);
                    spannableString.setSpan(new C15979Ulv(wwp, r15), 0, spannableString.length(), 0);
                    textView.setText(TextUtils.concat(new CharSequence[]{spannableString, " ", string}));
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    if (r10 != null) {
                        a7e.A04.setUrl(user.Bh3(), r10);
                    }
                    AnonymousClass0fU.A00(new W9Y(wwp, r15), a7e.A04);
                    TextView textView2 = a7e.A02;
                    String str = uKs.A08;
                    if (str == null) {
                        str = "";
                    }
                    textView2.setText(str);
                    ImageView imageView = a7e.A01;
                    imageView.setVisibility(0);
                    if (iUm != null) {
                        AnonymousClass0fU.A00(new W9l(wwp, r15, iUm), imageView);
                    }
                }
            } else {
                th = new IllegalStateException("Required value was null.");
                i2 = -1889430442;
                AnonymousClass0fD.A0A(i2, A032);
                throw th;
            }
        } else if (i3 == 1) {
            Context context = this.A02;
            Object tag2 = view2.getTag();
            if (tag2 != null) {
                r15 = this.A01;
                UE4 ue4 = (UE4) tag2;
                W2c.A02(context, r15, ue4, iUm, wwp.A00(), wwp, false);
            } else {
                th = new IllegalStateException("Required value was null.");
                i2 = 620764283;
                AnonymousClass0fD.A0A(i2, A032);
                throw th;
            }
        } else if (i3 != 2) {
            if (i3 == 3) {
                C2363633l r1 = this.A00;
                if (r1 != null) {
                    r1.A01(view2, this.A03, wwp, iUm);
                    AnonymousClass0fD.A0A(-884097558, A032);
                }
                th = new IllegalStateException("Required value was null.");
                i2 = 1111268845;
            } else if (i3 == 4) {
                Object tag3 = view2.getTag();
                if (tag3 != null) {
                    C17997VjZ A002 = wwp.A00();
                    r15 = this.A01;
                    C18719Vys.A02(r15, (C14907UEm) tag3, A002, false);
                } else {
                    th = new IllegalStateException("Required value was null.");
                    i2 = 1705800453;
                }
            } else {
                th = new UnsupportedOperationException(AnonymousClass000.A00(33));
                i2 = 503124595;
            }
            AnonymousClass0fD.A0A(i2, A032);
            throw th;
        } else {
            Context context2 = this.A02;
            Object tag4 = view2.getTag();
            if (tag4 != null) {
                C49344Etz etz = (C49344Etz) tag4;
                r15 = this.A01;
                0qQ.A0B(context2, 0);
                0qQ.A0B(etz, 1);
                0qQ.A0B(wwp, 2);
                0qQ.A0B(r15, 3);
                C15039UKs uKs2 = wwp.A01;
                String str2 = uKs2.A05;
                if (str2 == null) {
                    str2 = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context2.getColor(2Yu.A0H(context2, R.attr.igds_color_secondary_text))), 0, spannableStringBuilder.length(), 0);
                Boolean bool = uKs2.A02;
                if (bool != null && bool.booleanValue()) {
                    spannableStringBuilder.append(" ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(context2.getResources().getString(2131957519));
                    spannableStringBuilder.setSpan(new C15978Ulu(wwp, r15, 2Yu.A0F(context2, R.attr.textColorBoldLink)), length, spannableStringBuilder.length(), 0);
                    etz.A00.setMovementMethod(LinkMovementMethod.getInstance());
                }
                etz.A00.setText(spannableStringBuilder);
            } else {
                th = new IllegalStateException("Required value was null.");
                i2 = -1859425022;
                AnonymousClass0fD.A0A(i2, A032);
                throw th;
            }
        }
        AnonymousClass2pB r0 = r15.A05;
        r0.A01.A05(view2, r0.A02.A00(002.A0G(wwp.getId(), ':', i3)));
        AnonymousClass0fD.A0A(-884097558, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r6, Object obj, Object obj2) {
        WWP wwp = (WWP) obj;
        C57251IUm iUm = (C57251IUm) obj2;
        if (iUm == null || !iUm.CdP()) {
            AnonymousClass2pB r2 = this.A01.A05;
            if (r6 != null) {
                r6.A7U(0);
            }
            if (wwp == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (iUm != null) {
                r2.A00(wwp, iUm, 0);
                if (r6 != null) {
                    r6.A7U(4);
                }
                r2.A00(wwp, iUm, 4);
                if (r6 != null) {
                    r6.A7U(1);
                }
                r2.A00(wwp, iUm, 1);
                if (0qQ.A0K(A05, "v1")) {
                    if (r6 != null) {
                        r6.A7U(2);
                    }
                    r2.A00(wwp, iUm, 2);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (r6 != null) {
            r6.A7U(3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: X.A7E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.UE4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: X.A7E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: X.A7E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: X.Etz} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r0 != false) goto L_0x005d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(int r6, android.view.ViewGroup r7) {
        /*
            r5 = this;
            r0 = -45197797(0xfffffffffd4e561b, float:-1.7141753E37)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r1 = 1
            X.0qQ.A0B(r7, r1)
            java.lang.String r4 = X.C230192p8.A06
            A05 = r4
            if (r6 == 0) goto L_0x0049
            if (r6 == r1) goto L_0x0075
            r0 = 2
            if (r6 == r0) goto L_0x0030
            r0 = 3
            if (r6 == r0) goto L_0x0029
            r0 = 4
            if (r6 != r0) goto L_0x00a7
            com.instagram.common.session.UserSession r0 = r5.A03
            android.view.View r1 = X.C18719Vys.A00(r7, r0, r4)
        L_0x0022:
            r0 = -871876397(0xffffffffcc0838d3, float:-3.5709772E7)
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        L_0x0029:
            android.content.Context r0 = r5.A02
            android.view.View r1 = X.C2363733m.A00(r0, r7, r4, r1)
            goto L_0x0022
        L_0x0030:
            r2 = 0
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131629058(0x7f0e1402, float:1.8885426E38)
            android.view.View r1 = r1.inflate(r0, r7, r2)
            X.0qQ.A0A(r1)
            X.Etz r0 = new X.Etz
            r0.<init>(r1)
            goto L_0x009f
        L_0x0049:
            r2 = 0
            java.lang.String r0 = "v2"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "v3"
            boolean r0 = r4.equals(r0)
            r1 = 2131629059(0x7f0e1403, float:1.8885428E38)
            if (r0 == 0) goto L_0x0060
        L_0x005d:
            r1 = 2131629060(0x7f0e1404, float:1.888543E38)
        L_0x0060:
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r1 = r0.inflate(r1, r7, r2)
            X.0qQ.A0A(r1)
            X.A7E r0 = new X.A7E
            r0.<init>(r1)
            goto L_0x009f
        L_0x0075:
            java.lang.String r0 = "v2"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "v3"
            boolean r0 = r4.equals(r0)
            r2 = 2131628612(0x7f0e1244, float:1.8884522E38)
            if (r0 != 0) goto L_0x008b
            r2 = 2131628610(0x7f0e1242, float:1.8884518E38)
        L_0x008b:
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 0
            android.view.View r1 = r1.inflate(r2, r7, r0)
            X.UE4 r0 = new X.UE4
            r0.<init>(r1)
            r0.A01 = r4
        L_0x009f:
            r1.setTag(r0)
            goto L_0x0022
        L_0x00a3:
            r2 = 2131628611(0x7f0e1243, float:1.888452E38)
            goto L_0x008b
        L_0x00a7:
            java.lang.String r0 = "Unhandled view type"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            r0 = 1289948045(0x4ce30b8d, float:1.19037032E8)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231752sI.createView(int, android.view.ViewGroup):android.view.View");
    }
}
