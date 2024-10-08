package X;

import android.content.Context;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.LruCache;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7bB  reason: invalid class name and case insensitive filesystem */
public final class C334387bB implements C334397bC {
    public AnonymousClass7a4 A00 = new AnonymousClass7a4((LruCache) null, (List) null, (List) null, (DefaultConstructorMarker) null, 7);
    public final Context A01;
    public final C334367b9 A02;
    public final 0sP A03;
    public final C334377bA A04;
    public final UserSession A05;
    public final C249763kK A06;
    public final 0sK A07;

    public C334387bB(Context context, C334377bA r8, C334367b9 r9, UserSession userSession, C249763kK r11, 0sP r12, 0sK r13) {
        this.A02 = r9;
        this.A01 = context;
        this.A05 = userSession;
        this.A04 = r8;
        this.A06 = r11;
        this.A03 = r12;
        this.A07 = r13;
    }

    private final void A00(C381459bn r9, ComposerAutoCompleteTextView composerAutoCompleteTextView, String str, String str2, String str3, int i, int i2) {
        int i3;
        composerAutoCompleteTextView.A08 = false;
        Context context = this.A01;
        ImageSpan A002 = C393839x5.A00(context, true, false);
        Spannable spannable = (Spannable) this.A07.invoke(Integer.valueOf(i), Integer.valueOf(i2), 002.A0R(str3, str));
        if (spannable != null) {
            int length = i + str3.length();
            spannable.setSpan(A002, length, length + 3, 33);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(2Yu.A0F(context, R.attr.textColorPrimary));
            if (str != null) {
                i3 = str.length();
            } else {
                i3 = 0;
            }
            spannable.setSpan(foregroundColorSpan, length, i3 + length, 33);
            AnonymousClass7a4 r0 = this.A00;
            0qQ.A0B(str2, 0);
            r0.A00.put(str2, r9);
            composerAutoCompleteTextView.dismissDropDown();
            composerAutoCompleteTextView.A08 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
        if (X.11R.A01(r8.getText().charAt(r12 - 1)) != false) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AK2(X.C381459bn r15, java.lang.String r16, boolean r17) {
        /*
            r14 = this;
            r4 = 0
            r6 = r14
            com.instagram.common.session.UserSession r2 = r14.A05
            X.Axs r1 = X.C41640Axs.A00
            java.lang.Class<X.A4R> r0 = X.A4R.class
            java.lang.Object r2 = r2.A01(r0, r1)
            X.A4R r2 = (X.A4R) r2
            monitor-enter(r2)
            android.util.LruCache r0 = r2.A00     // Catch:{ all -> 0x0119 }
            r3 = r16
            java.lang.Object r1 = r0.get(r3)     // Catch:{ all -> 0x0119 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0119 }
            monitor-exit(r2)
            if (r1 != 0) goto L_0x002d
            if (r17 == 0) goto L_0x002c
            if (r15 == 0) goto L_0x002c
            X.7a4 r0 = r14.A00
            android.util.LruCache r0 = r0.A00
            r0.put(r3, r15)
            X.7a4 r0 = r14.A00
            r0.A01(r3)
        L_0x002c:
            return
        L_0x002d:
            X.7b9 r0 = r14.A02
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r8 = r0.Ae1()
            if (r8 == 0) goto L_0x002c
            android.text.Editable r0 = r8.getText()
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x002c
            if (r17 == 0) goto L_0x0069
            java.lang.String r0 = "@\\[\\][^0-9]+"
            X.11S r5 = new X.11S
            r5.<init>(r0)
            android.text.Editable r3 = r8.getText()
            X.0qQ.A07(r3)
            r2 = 15
            X.J6O r0 = new X.J6O
            r0.<init>(r8, r2)
            java.lang.String r2 = r5.A02(r3, r0)
            X.0sP r0 = r14.A03
            r0.invoke(r2)
            int r0 = r8.length()
            r8.setSelection(r0)
        L_0x0069:
            android.text.Editable r2 = r8.getText()
            int r0 = r8.getSelectionStart()
            if (r0 >= r4) goto L_0x0074
            r0 = 0
        L_0x0074:
            java.lang.CharSequence r3 = r2.subSequence(r4, r0)
            java.lang.String r2 = "@"
            X.0qQ.A0B(r3, r4)
            int r0 = r3.length()
            int r0 = r0 + -1
            int r12 = X.00l.A07(r3, r2, r0)
            if (r12 >= r4) goto L_0x008a
            r12 = 0
        L_0x008a:
            int r13 = r8.getSelectionEnd()
            if (r13 >= r4) goto L_0x0091
            r13 = 0
        L_0x0091:
            int r3 = r12 + 1
            if (r3 >= r13) goto L_0x0096
            r4 = 1
        L_0x0096:
            if (r12 == 0) goto L_0x00a9
            android.text.Editable r2 = r8.getText()
            int r0 = r12 + -1
            char r0 = r2.charAt(r0)
            boolean r2 = X.11R.A01(r0)
            r0 = 0
            if (r2 == 0) goto L_0x00aa
        L_0x00a9:
            r0 = 1
        L_0x00aa:
            if (r4 == 0) goto L_0x002c
            if (r0 == 0) goto L_0x002c
            android.text.Editable r2 = r8.getText()
            int r0 = r13 + -1
            char r0 = r2.charAt(r0)
            boolean r0 = X.11R.A01(r0)
            if (r0 != 0) goto L_0x00c0
            if (r17 == 0) goto L_0x002c
        L_0x00c0:
            android.text.Editable r0 = r8.getText()
            X.0qQ.A07(r0)
            java.lang.CharSequence r0 = r0.subSequence(r3, r13)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = X.00l.A0B(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Integer r3 = X.00y.A0l(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x00df:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0117
            java.lang.Object r7 = r2.next()
            r0 = r7
            X.9bn r0 = (X.C381459bn) r0
            int r0 = r0.A00
            int r1 = r0 + 1
            if (r3 == 0) goto L_0x00df
            int r0 = r3.intValue()
            if (r1 != r0) goto L_0x00df
        L_0x00f8:
            X.9bn r7 = (X.C381459bn) r7
            if (r7 == 0) goto L_0x002c
            java.lang.String r2 = "@[] "
            int r0 = r7.A00
            int r1 = r0 + 1
            r0 = 32
            java.lang.String r9 = X.002.A0I(r2, r0, r1)
            java.lang.String r10 = java.lang.String.valueOf(r1)
            if (r12 != 0) goto L_0x0114
            java.lang.String r11 = ""
        L_0x0110:
            r6.A00(r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0114:
            java.lang.String r11 = " "
            goto L_0x0110
        L_0x0117:
            r7 = 0
            goto L_0x00f8
        L_0x0119:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C334387bB.AK2(X.9bn, java.lang.String, boolean):void");
    }

    public final void D4r() {
        this.A00 = new AnonymousClass7a4((LruCache) null, (List) null, (List) null, (DefaultConstructorMarker) null, 7);
    }

    public final void DrU(C381459bn r13) {
        ComposerAutoCompleteTextView Ae1 = this.A02.Ae1();
        if (Ae1 != null) {
            C381459bn r5 = r13;
            int i = r13.A00 + 1;
            String valueOf = String.valueOf(i);
            String A0I = 002.A0I("@[] ", ' ', i);
            Editable text = Ae1.getText();
            int selectionStart = Ae1.getSelectionStart();
            if (selectionStart < 0) {
                selectionStart = 0;
            }
            CharSequence subSequence = text.subSequence(0, selectionStart);
            0qQ.A0B(subSequence, 0);
            int A072 = 00l.A07(subSequence, "@", subSequence.length() - 1);
            if (A072 < 0) {
                A072 = 0;
            }
            int selectionEnd = Ae1.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            A00(r5, Ae1, A0I, valueOf, "", A072, selectionEnd);
        }
    }

    public final void E4L(C381459bn r13) {
        ComposerAutoCompleteTextView Ae1;
        String str;
        LruCache lruCache = this.A00.A00;
        C381459bn r5 = r13;
        0qQ.A0B(r13, 0);
        int i = r13.A00 + 1;
        String valueOf = String.valueOf(i);
        if (lruCache.get(valueOf) == null && (Ae1 = this.A02.Ae1()) != null) {
            Ae1.setSelection(Ae1.length());
            String A0I = 002.A0I("@[] ", ' ', i);
            int selectionStart = Ae1.getSelectionStart();
            if (selectionStart < 0) {
                selectionStart = 0;
            }
            int selectionEnd = Ae1.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            if (selectionStart == 0) {
                str = "";
            } else {
                str = " ";
            }
            A00(r5, Ae1, A0I, valueOf, str, selectionStart, selectionEnd);
        }
    }

    public final String EFM(String str) {
        int i;
        0qQ.A0B(str, 0);
        StringBuilder sb = new StringBuilder(str);
        Iterator it = C253053q8.A04(str).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C255723uc r8 = (C255723uc) it.next();
            String A0g = 00p.A0g(r8.A02, "@[] ", "", false);
            if (A0g.length() > 0 && this.A00.A00.get(A0g) != null) {
                String A0R = 002.A0R("@[]", ((C381459bn) this.A00.A00.get(A0g)).A01);
                int i3 = r8.A01;
                int i4 = r8.A00;
                sb.replace(i3 - i2, i4 - i2, A0R);
                int i5 = i4 - i3;
                if (A0R != null) {
                    i = A0R.length();
                } else {
                    i = 0;
                }
                i2 += i5 - i;
                this.A00.A01(A0g);
            }
        }
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    public final void EuB(1Xj r8) {
        Context context = this.A01;
        Spanned A012 = 0bC.A01(context.getResources(), new String[0], 2131954801);
        0qQ.A07(A012);
        Integer valueOf = Integer.valueOf(R.drawable.ig_illustrations_qp_carousel_notes_refresh);
        C334367b9 r2 = this.A02;
        ViewStub Alo = r2.Alo();
        if (Alo != null && Alo.getParent() != null) {
            View inflate = Alo.inflate();
            0qQ.A0C(inflate, C66579MXk.A00(6));
            IgLinearLayout igLinearLayout = (IgLinearLayout) inflate;
            HWX.A00(context, r2, igLinearLayout, A012, valueOf);
            if (igLinearLayout != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.tooltip_banner_enter);
                0qQ.A07(loadAnimation);
                igLinearLayout.startAnimation(loadAnimation);
                igLinearLayout.setVisibility(0);
                C334377bA r5 = this.A04;
                C249763kK r4 = this.A06;
                0wc r22 = r5.A01;
                0Aj A002 = r22.A00(r22.A00, "ig_carousel_tool_tip_impression");
                if (A002.isSampled()) {
                    A002.AAJ("module", r5.A00.getModuleName());
                    String A2n = r8.A2n();
                    if (A2n != null) {
                        A002.A9F("ig_media_id", Long.valueOf(Long.parseLong(A2n)));
                        A002.AAJ("ranking_info_token", r8.A0C.getLoggingInfoToken());
                        A002.AAJ("detail", (String) null);
                        A002.A9F("m_ix", (Long) null);
                        A002.A9F("recs_ix", (Long) null);
                        A002.AAJ(AnonymousClass000.A00(150), r8.A0R);
                        A002.AAJ(AnonymousClass000.A00(358), r4.getSessionId());
                        A002.Cgf();
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                0xa r23 = 1Au.A00(this.A05).A01;
                int i = r23.getInt("carousel_child_comment_tooltip_banner_seen_count", 0);
                0xY AR4 = r23.AR4();
                AR4.E5Z("carousel_child_comment_tooltip_banner_seen_count", i + 1);
                AR4.E5c("carousel_caption_tooltip_last_shown_time_ms", System.currentTimeMillis());
                AR4.apply();
            }
        }
    }

    public final AnonymousClass7a4 Bwp() {
        return this.A00;
    }

    public final void DfK(AnonymousClass7a4 r1) {
        this.A00 = r1;
    }
}
