package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsFooterCell;

/* renamed from: X.DpT  reason: case insensitive filesystem */
public final class C47036DpT extends C249703kE {
    public final Context A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final IgdsFooterCell A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47036DpT(AnonymousClass4DH r2, UserSession userSession, IgdsFooterCell igdsFooterCell) {
        super(igdsFooterCell);
        AnonymousClass7TG.A1O(r2, userSession);
        this.A01 = r2;
        this.A02 = userSession;
        this.A03 = igdsFooterCell;
        this.A00 = r2.requireContext();
    }

    public static final int A00(Integer num, String str) {
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue == 3) {
                    switch (str.hashCode()) {
                        case 3138974:
                            if (str.equals("feed")) {
                                return 2131969282;
                            }
                            break;
                        case 3230752:
                            if (str.equals("igtv")) {
                                return 2131969283;
                            }
                            break;
                        case 3496474:
                            if (str.equals("reel")) {
                                return 2131969284;
                            }
                            break;
                        case 109770997:
                            if (str.equals("story")) {
                                return 2131969285;
                            }
                            break;
                    }
                }
            } else {
                switch (str.hashCode()) {
                    case 3138974:
                        if (str.equals("feed")) {
                            return 2131953090;
                        }
                        break;
                    case 3230752:
                        if (str.equals("igtv")) {
                            return 2131953091;
                        }
                        break;
                    case 3496474:
                        if (str.equals("reel")) {
                            return 2131953092;
                        }
                        break;
                    case 109770997:
                        if (str.equals("story")) {
                            return 2131953093;
                        }
                        break;
                }
            }
        } else {
            switch (str.hashCode()) {
                case 3138974:
                    if (str.equals("feed")) {
                        return 2131953094;
                    }
                    break;
                case 3230752:
                    if (str.equals("igtv")) {
                        return 2131953095;
                    }
                    break;
                case 3322092:
                    if (str.equals("live")) {
                        return 2131953096;
                    }
                    break;
                case 3496474:
                    if (str.equals("reel")) {
                        return 2131953097;
                    }
                    break;
                case 109770997:
                    if (str.equals("story")) {
                        return 2131953098;
                    }
                    break;
            }
        }
        return C48726EjB.A00(num);
    }
}
