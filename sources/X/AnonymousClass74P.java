package X;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.74P  reason: invalid class name */
public final class AnonymousClass74P implements AnonymousClass7DS {
    public final int A00;
    public final int A01;
    public final C332847Wp A02;
    public final boolean A03;

    public AnonymousClass74P(C332847Wp r2, int i, int i2, boolean z) {
        0qQ.A0B(r2, 1);
        this.A02 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
    }

    public final boolean A00(C328667Fr r39, C328007Db r40) {
        List list;
        LinkedHashMap A07;
        C328667Fr r12 = r39;
        0qQ.A0B(r12, 0);
        C328007Db r3 = r40;
        0qQ.A0B(r3, 1);
        AnonymousClass7FU r4 = r12.A00;
        boolean BCL = r4.BCL();
        DirectMessageIdentifier directMessageIdentifier = r12.A0L;
        C332847Wp r8 = this.A02;
        if (C70020Nvy.A00((C332927Wz) r8, directMessageIdentifier, BCL)) {
            return true;
        }
        AnonymousClass9J6 r5 = r12.A08;
        String str = r5.A01;
        if (str.length() <= 0 || (this.A03 && "avatar_sticker_upsell_bloks_action".equalsIgnoreCase(Uri.parse(str).getHost()))) {
            MessageIdentifier Ar2 = r4.Ar2();
            if (!this.A03 || Ar2 == null) {
                return false;
            }
            ((C332887Wv) r8).AUo((C328007Db) null, Ar2.A01, true);
            return true;
        }
        AnonymousClass777 r1 = r12.A0F;
        if (r1 instanceof AnonymousClass776) {
            list = Collections.singletonList(((AnonymousClass776) r1).A00);
            0qQ.A07(list);
        } else {
            list = null;
        }
        String str2 = r5.A00;
        Long valueOf = Long.valueOf(r4.BSP());
        int i = this.A00;
        View BJd = r3.BJd();
        0qQ.A07(BJd);
        C68168N3i n3i = new C68168N3i(0nA.A0F(BJd), r3.BJd().getRotation());
        String str3 = r12.A0T;
        String str4 = r12.A0U;
        String str5 = r12.A0Y;
        if (r12.A0e || r12.A0V != null) {
            0eP r52 = new 0eP(TraceFieldType.ContentType, C66579MXk.A00(104));
            0eP r42 = new 0eP("agent_id", str2);
            String str6 = r12.A0V;
            if (str6 == null) {
                str6 = "";
            }
            A07 = 0Yt.A07(new 0eP[]{r52, r42, new 0eP("bot_response_id", str6), new 0eP("xma_tap_index", String.valueOf(this.A01))});
            String str7 = r12.A0W;
            if (str7 != null) {
                A07.put(AnonymousClass000.A00(1858), str7);
            }
        } else {
            A07 = null;
        }
        int i2 = i;
        C68168N3i n3i2 = n3i;
        DirectMessageIdentifier directMessageIdentifier2 = directMessageIdentifier;
        C332847Wp r15 = r8;
        r15.Cqp((View) null, (ImageUrl) null, n3i2, directMessageIdentifier2, (GradientSpinner) null, valueOf, (Long) null, str, str2, str3, str4, (String) null, str5, ((C332877Wu) r8).C6X(), (List) null, list, (List) null, (List) null, (List) null, A07, i2, false);
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        return A00((C328667Fr) obj, (C328007Db) obj2);
    }
}
