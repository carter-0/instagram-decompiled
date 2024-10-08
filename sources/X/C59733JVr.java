package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JVr  reason: case insensitive filesystem */
public final class C59733JVr extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59733JVr(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        super(0);
        this.A00 = i;
        this.A06 = obj;
        this.A03 = obj2;
        this.A07 = z;
        this.A01 = obj3;
        this.A05 = obj4;
        this.A04 = obj5;
        this.A02 = obj6;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Runnable mai;
        TextView textView;
        String str;
        AnonymousClass39A r1;
        C54683HOo hOo;
        switch (this.A00) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.A03;
                boolean z = this.A07;
                return new AnonymousClass8E8(viewGroup, (UserSession) this.A06, (C357638Yz) this.A01, (AnonymousClass88R) this.A04, (AnonymousClass80U) this.A05, (ClipsCreationViewModel) this.A02, z);
            case 1:
                C59739JVx jVx = (C59739JVx) this.A06;
                Medium medium = (Medium) this.A02;
                Bitmap bitmap = (Bitmap) this.A01;
                C343317q1 r4 = (C343317q1) this.A03;
                if (((C376529Ii) this.A04).A03 == AnonymousClass05K.A01) {
                    String valueOf = String.valueOf(medium.A05);
                    0qQ.A0B(bitmap, 0);
                    Map map = AnonymousClass8XE.A00;
                    BackgroundGradientColors backgroundGradientColors = (BackgroundGradientColors) map.get(valueOf);
                    if (backgroundGradientColors == null) {
                        backgroundGradientColors = 0oT.A01(bitmap, AnonymousClass05K.A00);
                        map.put(valueOf, backgroundGradientColors);
                    }
                    medium.A0H = backgroundGradientColors;
                    C59738JVw jVw = jVx.A03;
                    GradientDrawable gradientDrawable = jVw.A01;
                    if (gradientDrawable == null) {
                        gradientDrawable = new GradientDrawable();
                        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                        gradientDrawable.setDither(true);
                        jVw.A01 = gradientDrawable;
                    }
                    gradientDrawable.setColors(new int[]{backgroundGradientColors.A01, backgroundGradientColors.A00});
                } else {
                    jVx.A03.A01 = null;
                }
                02m.A0p.markerEnd(18949957, medium.A05, 2);
                if (r4 != null) {
                    1Jk.A08.A0H(new SimpleImageUrl(medium.A02().toString()), r4.A00, "gallery");
                    break;
                }
                break;
            case 2:
                boolean z2 = this.A07;
                0lg r3 = (0lg) this.A06;
                0qQ.A0B(r3, 0);
                long millis = TimeUnit.SECONDS.toMillis(182.A01(0Tu.A05, r3, 36609223195105104L));
                if (z2) {
                    TextView textView2 = (TextView) this.A05;
                    mai = new C66010M7v(textView2, (CharSequence) this.A04);
                    textView = textView2;
                } else {
                    View view = (View) this.A02;
                    C20704Wxb wxb = new C20704Wxb(2, this.A05, this.A04, this.A03);
                    mai = new MAI(view, (View) this.A01, C65733Lyn.A00, C65734Lyo.A00, "hide_memory_badge_animator_key", MLR.A00, MLS.A00, wxb);
                    textView = view;
                }
                textView.postDelayed(mai, millis);
                break;
            default:
                if (!this.A07) {
                    Context context = (Context) this.A02;
                    0qQ.A0B(context, 0);
                    PackageManager packageManager = context.getPackageManager();
                    String packageName = context.getPackageName();
                    String str2 = 0oI.A02;
                    try {
                        str = packageManager.getInstallerPackageName(packageName);
                        if (str == null) {
                            str = "";
                        }
                    } catch (IllegalArgumentException unused) {
                        str = "unknown";
                    }
                    if (!AnonymousClass000.A00(4616).equals(str)) {
                        ((C284945Oz) this.A06).Epw(true);
                        break;
                    } else {
                        C2376138k r2 = (C2376138k) this.A03;
                        r2.A00(3600000);
                        r2.A02(false);
                        0oI.A07(context, AnonymousClass000.A00(74), (String) null);
                        r1 = (AnonymousClass39A) this.A04;
                        hOo = C54683HOo.UPDATE_GOOGLE_PLAY;
                    }
                } else {
                    ((AnonymousClass9FM) this.A01).A00((Context) this.A02);
                    r1 = (AnonymousClass39A) this.A04;
                    hOo = C54683HOo.UPDATE_TO_ALPHA;
                }
                r1.A00(hOo);
                ((C62320sa) this.A05).invoke();
                break;
        }
        return C60340gF.A00;
    }
}
