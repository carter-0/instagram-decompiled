package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import go.Seq;

/* renamed from: X.Wvt  reason: case insensitive filesystem */
public final class C20612Wvt extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20612Wvt(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C322136vJ r3;
        ImageView.ScaleType scaleType;
        Object invoke;
        AnonymousClass07P r1;
        Object invoke2;
        switch (this.A00) {
            case 1:
            case 2:
            case 3:
            case 4:
                C61060Jvy jvy = (C61060Jvy) this.A02;
                C16518UwN CAZ = ((X4H) jvy.A01).CAZ();
                boolean z = !jvy.A03;
                0qQ.A0B(CAZ, 0);
                C15339Uap uap = ((C17779Vfq) this.A01).A00;
                C14777U8n u8n = (C14777U8n) uap.A05.getValue();
                C16518UwN uwN = CAZ;
                C18460Vs9 vs9 = u8n.A03;
                String name = CAZ.name();
                0qQ.A0B(name, 0);
                XB6 xb6 = vs9.A00;
                if (xb6 != null) {
                    XB6.A00(C18460Vs9.A00(vs9, name), xb6, vs9.A01, "lead_gen_creatives_context_card", "creatives_context_card_section_row_click");
                }
                05G r0 = u8n.A06;
                if (!z) {
                    uwN = null;
                }
                r0.Epw(uwN);
                if (z) {
                    RecyclerView recyclerView = uap.A00;
                    2Rw r32 = null;
                    if (recyclerView != null) {
                        r32 = recyclerView.A0A;
                    }
                    if ((r32 instanceof C14791U9g) && (r3 = (C322136vJ) r32) != null) {
                        int itemCount = r3.getItemCount();
                        int i = 0;
                        while (true) {
                            if (i >= itemCount) {
                                break;
                            } else if (((X4H) ((C61060Jvy) r3.getItem(i)).A01).CAZ() == CAZ) {
                                Integer valueOf = Integer.valueOf(i);
                                if (valueOf != null) {
                                    int intValue = valueOf.intValue();
                                    RecyclerView recyclerView2 = uap.A00;
                                    if (recyclerView2 != null) {
                                        recyclerView2.post(new C20227WnR(uap, intValue));
                                        break;
                                    }
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
                break;
            case 32:
                ((IgdsButton) this.A02).setStyle((C273014lo) this.A01);
                break;
            case 33:
                ((IgdsButton) this.A02).setSize((C273024lp) this.A01);
                break;
            case 34:
                if (((C53974GxI) this.A02).A00 != null) {
                    ((View) this.A01).setOnClickListener((View.OnClickListener) null);
                    break;
                }
                break;
            case 35:
                if (((C244423bA) this.A02).A03 != null) {
                    ((GradientSpinner) this.A01).setActiveStrokeWidth(4.0f);
                    break;
                }
                break;
            case 36:
                if (((C244423bA) this.A02).A04 != null) {
                    ((GradientSpinner) this.A01).setInactiveStrokeWidth(4.0f);
                    break;
                }
                break;
            case 37:
                IgProgressImageView igProgressImageView = (IgProgressImageView) this.A01;
                igProgressImageView.A04();
                if (((C53970GxE) this.A02).A01 != null) {
                    igProgressImageView.setProgressBarIndeterminate(false);
                    break;
                }
                break;
            case 38:
                Drawable drawable = ((GH5) this.A02).A00;
                if (drawable instanceof GAM) {
                    ValueAnimator valueAnimator = ((GAM) drawable).A08;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                }
                ((ImageView) this.A01).setImageDrawable((Drawable) null);
                break;
            case 39:
                scaleType = ((GH5) this.A02).A01;
                break;
            case 40:
                scaleType = ((C53984GxS) this.A02).A03;
                break;
            case Seq.NULL_REFNUM /*41*/:
                Number number = (Number) this.A01;
                if (number != null) {
                    ((View) this.A02).setVisibility(number.intValue());
                    break;
                }
                break;
            case Seq.RefTracker.REF_OFFSET /*42*/:
                ((TextView) this.A01).setText((CharSequence) this.A02);
                break;
            case 43:
                break;
            case 44:
                return new C11218SFs((Context) this.A01, (UserSession) this.A02);
            case 45:
                Context applicationContext = ((Context) this.A01).getApplicationContext();
                0qQ.A07(applicationContext);
                return new FA7(applicationContext, (UserSession) this.A02);
            case 46:
                return C342017nu.A00((Context) this.A01, (UserSession) this.A02).A02.getValue();
            case 47:
                C62320sa r02 = (C62320sa) this.A01;
                if (r02 == null || (invoke = r02.invoke()) == null) {
                    return ((ComponentActivity) this.A02).getDefaultViewModelCreationExtras();
                }
                return invoke;
            case 48:
                return new C19160WNs((Context) this.A01, (UserSession) this.A02);
            case 49:
                return new LeX((Context) this.A01, (UserSession) this.A02);
            default:
                C62320sa r03 = (C62320sa) this.A01;
                if (r03 != null && (invoke2 = r03.invoke()) != null) {
                    return invoke2;
                }
                AnonymousClass07g r12 = (AnonymousClass07g) ((AnonymousClass0eM) this.A02).getValue();
                if (!(r12 instanceof AnonymousClass07P) || (r1 = (AnonymousClass07P) r12) == null) {
                    return AnonymousClass2YP.A00;
                }
                return r1.getDefaultViewModelCreationExtras();
        }
        if (scaleType != null) {
            ((ImageView) this.A01).setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        return C60340gF.A00;
    }
}
