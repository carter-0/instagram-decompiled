package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.logging.LoggingContext;
import com.instagram.android.R;

/* renamed from: X.QhM  reason: case insensitive filesystem */
public final class C8128QhM extends QCJ implements C13732Tg4 {
    public ContextThemeWrapper A00;
    public ShimmerFrameLayout A01;
    public ShimmerFrameLayout A02;
    public ShimmerFrameLayout A03;
    public QD6 A04;
    public ECPHandler A05;
    public EcpUIConfiguration A06;
    public LoggingContext A07;

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.QCJ, X.QhM] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            View requireViewById = view.requireViewById(R.id.title_shimmer_view);
            0qQ.A0C(requireViewById, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            this.A03 = (ShimmerFrameLayout) requireViewById;
            View requireViewById2 = view.requireViewById(R.id.subtitle_shimmer_view);
            0qQ.A0C(requireViewById2, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            this.A02 = (ShimmerFrameLayout) requireViewById2;
            View requireViewById3 = view.requireViewById(R.id.body_shimmer_view);
            0qQ.A0C(requireViewById3, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            this.A01 = (ShimmerFrameLayout) requireViewById3;
            ViewGroup viewGroup = (ViewGroup) view.requireViewById(R.id.ecp_loading_layout);
            EcpUIConfiguration ecpUIConfiguration = this.A06;
            if (ecpUIConfiguration == null) {
                str = "ecpUIConfiguration";
            } else {
                if (ecpUIConfiguration.A07.A07) {
                    SSH ssh = C9961RkG.A00;
                    0qQ.A0A(viewGroup);
                    ssh.A04(viewGroup);
                }
                ShimmerFrameLayout shimmerFrameLayout = this.A03;
                if (shimmerFrameLayout != null) {
                    AnonymousClass2E0.A0A();
                    requireContext();
                    Drawable drawable = activity.getDrawable(R.drawable.fbpay_shimmer_background);
                    if (drawable != null) {
                        AnonymousClass2E0.A0A();
                        Pxi.A0u(requireContext(), drawable, shimmerFrameLayout, R.color.igds_primary_text);
                        ShimmerFrameLayout shimmerFrameLayout2 = this.A02;
                        if (shimmerFrameLayout2 != null) {
                            AnonymousClass2E0.A0A();
                            requireContext();
                            Drawable drawable2 = activity.getDrawable(R.drawable.fbpay_shimmer_background);
                            if (drawable2 != null) {
                                AnonymousClass2E0.A0A();
                                Pxi.A0u(requireContext(), drawable2, shimmerFrameLayout2, R.color.igds_primary_text);
                                ShimmerFrameLayout shimmerFrameLayout3 = this.A01;
                                str = "bodyShimmerView";
                                if (shimmerFrameLayout3 != null) {
                                    AnonymousClass2E0.A0A();
                                    requireContext();
                                    Drawable drawable3 = activity.getDrawable(R.drawable.fbpay_shimmer_background);
                                    if (drawable3 != null) {
                                        AnonymousClass2E0.A0A();
                                        Pxi.A0u(requireContext(), drawable3, shimmerFrameLayout3, R.color.igds_primary_text);
                                        ShimmerFrameLayout shimmerFrameLayout4 = this.A03;
                                        if (shimmerFrameLayout4 != null) {
                                            C54770HSc.A00(shimmerFrameLayout4, (Integer) null);
                                            ShimmerFrameLayout shimmerFrameLayout5 = this.A02;
                                            if (shimmerFrameLayout5 != null) {
                                                C54770HSc.A00(shimmerFrameLayout5, (Integer) null);
                                                ShimmerFrameLayout shimmerFrameLayout6 = this.A01;
                                                if (shimmerFrameLayout6 != null) {
                                                    C54770HSc.A00(shimmerFrameLayout6, (Integer) null);
                                                    ShimmerFrameLayout shimmerFrameLayout7 = this.A03;
                                                    if (shimmerFrameLayout7 != null) {
                                                        shimmerFrameLayout7.setVisibility(0);
                                                        ShimmerFrameLayout shimmerFrameLayout8 = this.A02;
                                                        if (shimmerFrameLayout8 != null) {
                                                            shimmerFrameLayout8.setVisibility(0);
                                                            ShimmerFrameLayout shimmerFrameLayout9 = this.A01;
                                                            if (shimmerFrameLayout9 != null) {
                                                                shimmerFrameLayout9.setVisibility(0);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                    }
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                        0qQ.A0F("subtitleShimmerView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                0qQ.A0F("titleShimmerView");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        QD6 qd6 = this.A04;
        if (qd6 != null) {
            Dba.A16(this, qd6.A06, TY2.A00(this, 45), 31);
            QD6 qd62 = this.A04;
            if (qd62 != null) {
                Dba.A16(this, qd62.A05, TY2.A00(this, 46), 31);
                return;
            }
        }
        0qQ.A0F("ecpUrlViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EUk(ECPHandler eCPHandler) {
        this.A05 = eCPHandler;
        QD6 qd6 = this.A04;
        if (qd6 == null) {
            return;
        }
        if (eCPHandler != null) {
            ECPHandler eCPHandler2 = qd6.A00;
            if (eCPHandler2 == null || eCPHandler2.equals(eCPHandler)) {
                qd6.A00 = eCPHandler;
                return;
            }
            throw AnonymousClass7TE.A0z("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
        }
        throw AnonymousClass7TE.A0z("Attempting to set null value for EcpHandler. This will result in lossy event-handling behavior");
    }

    public final boolean D0T(LoggingContext loggingContext, Integer num) {
        boolean A1Z = AnonymousClass7TG.A1Z(num, loggingContext);
        QD6 qd6 = this.A04;
        if (qd6 == null) {
            0qQ.A0F("ecpUrlViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        qd6.A00(loggingContext, num);
        return A1Z;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07g, androidx.fragment.app.Fragment, X.QhM] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1206022619);
        C8128QhM.super.onCreate(bundle);
        QD6 A002 = new 2YN(this).A00(QD6.class);
        this.A04 = A002;
        ECPHandler eCPHandler = this.A05;
        if (eCPHandler != null) {
            if (A002 != null) {
                ECPHandler eCPHandler2 = A002.A00;
                if (eCPHandler2 == null || eCPHandler2.equals(eCPHandler)) {
                    A002.A00 = eCPHandler;
                } else {
                    throw AnonymousClass7TE.A0z("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
                }
            }
            0qQ.A0F("ecpUrlViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        QD6 qd6 = this.A04;
        if (qd6 != null) {
            Bundle requireArguments = requireArguments();
            qd6.A06.A0B((Object) null);
            qd6.A05.A0B((Object) null);
            String string = requireArguments.getString(Py7.A00());
            if (string != null) {
                qd6.A04 = string;
                String string2 = requireArguments.getString("product_id");
                if (string2 != null) {
                    qd6.A02 = string2;
                    String string3 = requireArguments.getString("order_id");
                    if (string3 != null) {
                        qd6.A01 = string3;
                        String string4 = requireArguments.getString("receiver_id");
                        if (string4 != null) {
                            qd6.A03 = string4;
                            String str = qd6.A04;
                            if (str == null) {
                                0qQ.A0F("sessionId");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            String str2 = qd6.A02;
                            if (str2 == null) {
                                0qQ.A0F("productId");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            String str3 = qd6.A01;
                            if (str3 == null) {
                                0qQ.A0F("orderId");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            Parcelable parcelable = requireArguments.getParcelable("ECP_UI_CONFIGURATION");
                            if (parcelable != null) {
                                AnonymousClass7TE.A1Z(new TTB(parcelable, qd6, string4, str, str3, str2, (AnonymousClass4D7) null, 0), (C262224Cq) qd6.A07.getValue());
                                Parcelable parcelable2 = requireArguments().getParcelable("ECP_UI_CONFIGURATION");
                                0qQ.A0C(parcelable2, "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.EcpUIConfiguration");
                                this.A06 = (EcpUIConfiguration) parcelable2;
                                AnonymousClass0fD.A09(1152000562, A022);
                                return;
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        0qQ.A0F("ecpUrlViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2080278597);
        ContextThemeWrapper A002 = QCJ.A00(this, layoutInflater);
        this.A00 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_loading_content_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1458969016, A022);
        return inflate;
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1345204402);
        super.onResume();
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            str = "viewContext";
        } else {
            EcpUIConfiguration ecpUIConfiguration = this.A06;
            if (ecpUIConfiguration == null) {
                str = "ecpUIConfiguration";
            } else {
                C9656Rea.A00(contextThemeWrapper, this, ecpUIConfiguration.A07, (String) null, (String) null, new C13346TVt(this, 11), TV5.A00, false, false);
                AnonymousClass0fD.A09(1738224917, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
