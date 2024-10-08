package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.7Kn  reason: invalid class name and case insensitive filesystem */
public final class C329867Kn {
    public static final Set A0L = 0sc.A07(new String[]{"❤️", "👍", "😢", "😍", "😮", "😂", "👏"});
    public static final Set A0M = 0sc.A07(new Enum[]{AnonymousClass7Q3.MENTION, AnonymousClass7Q3.EMOJI_REACTION, AnonymousClass7Q3.REPLY, 2FW.A1D, 2FW.A1v, 2FW.A1e, 2FW.A20, 2FW.A0W, 2FW.A1p, 2FW.A0t, 2FW.A1r});
    public View A00;
    public TextView A01;
    public Integer A02;
    public Number A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final ViewStub A0A;
    public final AnonymousClass0iw A0B;
    public final UserSession A0C;
    public final C329117Hq A0D;
    public final AnonymousClass7Q4 A0E;
    public final C254773t1 A0F;
    public final AnonymousClass7Q6 A0G;
    public final Integer A0H;
    public final String A0I;
    public final Set A0J;
    public final List A0K;

    public C329867Kn(Context context, ViewStub viewStub, AnonymousClass0iw r6, UserSession userSession, C329117Hq r8, C254773t1 r9, List list) {
        Integer num;
        0qQ.A0B(viewStub, 4);
        0qQ.A0B(list, 7);
        this.A09 = context;
        this.A0C = userSession;
        this.A0B = r6;
        this.A0A = viewStub;
        this.A0D = r8;
        this.A0F = r9;
        this.A0K = list;
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36314880495651692L) || 182.A06(r2, userSession, 36314880495782765L)) {
            num = AnonymousClass05K.A00;
        } else {
            boolean A062 = 182.A06(r2, userSession, 36314880495913838L);
            0qQ.A0A(Boolean.valueOf(A062));
            if (A062) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0C;
            }
        }
        this.A0H = num;
        String A022 = AnonymousClass4KK.A02(r9);
        this.A0I = A022 == null ? "" : A022;
        this.A0J = new LinkedHashSet();
        this.A0E = new AnonymousClass7Q4(r6, userSession, num, list);
        this.A0G = new AnonymousClass7Q5(this);
    }

    public static final void A01(C329867Kn r5, String str, int i) {
        r5.A05 = false;
        A02(r5, true);
        r5.A0D.A00.A1i.A06((C70766OKm) null, str, (String) null);
        AnonymousClass7Q4 r4 = r5.A0E;
        String str2 = r5.A0I;
        String str3 = r5.A04;
        if (str3 == null) {
            0qQ.A0F("lastMessageReelTypeForLogging");
            throw AnonymousClass00P.createAndThrow();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        hashMap.put("message_type", str3);
        hashMap.put("button_index", String.valueOf(i));
        AnonymousClass7Q4.A00(r4, "emoji_tray_click", hashMap);
    }

    public static final void A00(C329867Kn r2) {
        String str;
        View view = r2.A00;
        if (view == null) {
            str = "emojiContainerView";
        } else {
            Number number = r2.A03;
            if (number == null) {
                str = "backgroundColor";
            } else {
                view.setBackgroundColor(number.intValue());
                TextView textView = r2.A01;
                if (textView == null) {
                    str = "helperTextView";
                } else {
                    Integer num = r2.A02;
                    if (num != null) {
                        textView.setTextColor(num.intValue());
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A03() {
        if (this.A07) {
            View view = this.A00;
            if (view == null) {
                0qQ.A0F("emojiContainerView");
                throw AnonymousClass00P.createAndThrow();
            } else if (view.getVisibility() != 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static final void A02(C329867Kn r5, boolean z) {
        if (r5.A03()) {
            if (!z) {
                View view = r5.A00;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
            } else if (!r5.A06) {
                r5.A06 = true;
                View view2 = r5.A00;
                if (view2 != null) {
                    C294975nL A012 = C294975nL.A01(view2, 0);
                    A012.A0G();
                    C294975nL A0F2 = A012.A0F(true);
                    View view3 = r5.A00;
                    if (view3 != null) {
                        A0F2.A0T(0.0f, (float) view3.getMeasuredHeight());
                        A0F2.A03 = 8;
                        A0F2.A05 = new Ag2(r5);
                        A0F2.A0H();
                        return;
                    }
                }
            } else {
                return;
            }
            0qQ.A0F("emojiContainerView");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
