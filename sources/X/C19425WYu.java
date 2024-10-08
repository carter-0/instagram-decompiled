package X;

import android.app.Activity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.WYu  reason: case insensitive filesystem */
public final class C19425WYu implements C66494MTx {
    public final int A00;
    public final Object A01;

    public C19425WYu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DWl(C346927vz r9) {
        String str;
        switch (this.A00) {
            case 0:
                if (r9 == C346927vz.GRANTED) {
                    C15285UZp uZp = (C15285UZp) this.A01;
                    C15285UZp.A04(uZp, true);
                    IgdsSwitch igdsSwitch = uZp.A0A;
                    if (igdsSwitch == null) {
                        str = "useCurrentLocationSwitch";
                    } else {
                        PromoteData promoteData = uZp.A05;
                        if (promoteData == null) {
                            str = "promoteData";
                        } else {
                            igdsSwitch.setChecked(promoteData.A0o.A00());
                            return;
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            case 1:
                int ordinal = r9.ordinal();
                if (ordinal == 0) {
                    C19204WPk wPk = (C19204WPk) this.A01;
                    MediaMapFragment mediaMapFragment = wPk.A0K;
                    if (mediaMapFragment.isResumed()) {
                        mediaMapFragment.A03.A01();
                    }
                    wPk.A07();
                    wPk.A05();
                    return;
                } else if (ordinal == 2) {
                    C19204WPk wPk2 = (C19204WPk) this.A01;
                    if (!wPk2.A0Q) {
                        1Wr r2 = 1Wr.A00;
                        if (r2 != null) {
                            UserSession userSession = wPk2.A0H;
                            if (r2.shouldUseDevicePermissionKit(userSession, C16530Uwa.DISCOVERY_MAP) && r2.shouldUseNewNativeReconsiderDialog(userSession)) {
                                return;
                            }
                        }
                        Activity activity = wPk2.A08;
                        UserSession userSession2 = wPk2.A0H;
                        AnonymousClass4O6 A002 = C19204WPk.A00(activity, userSession2, wPk2);
                        String A0c = AnonymousClass7TF.A0c();
                        C16128UpF upF = new C16128UpF(this, A002, A0c, 0);
                        VK6.A00.A03(userSession2, A002, "DISCOVERY_MAP", A0c);
                        W38.A05(activity, upF);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                DbS.A1U(this.A01);
                return;
            default:
                int ordinal2 = r9.ordinal();
                if (ordinal2 == 0) {
                    WZ2.A00((WZ2) this.A01);
                    return;
                } else if (ordinal2 == 2) {
                    WZ2 wz2 = (WZ2) this.A01;
                    if (!wz2.A06) {
                        1Wr r22 = 1Wr.A00;
                        if (r22 != null) {
                            UserSession userSession3 = wz2.A03;
                            if (r22.shouldUseDevicePermissionKit(userSession3, C16530Uwa.STORY_ARCHIVE_MAP) && r22.shouldUseNewNativeReconsiderDialog(userSession3)) {
                                return;
                            }
                        }
                        String A0c2 = AnonymousClass7TF.A0c();
                        UserSession userSession4 = wz2.A03;
                        AnonymousClass4O6 r3 = new AnonymousClass4O6(new WPT(this), userSession4);
                        C16128UpF upF2 = new C16128UpF(this, r3, A0c2, 1);
                        VK6.A00.A03(userSession4, r3, "STORY_ARCHIVE_MAP", A0c2);
                        W38.A05(wz2.A01, upF2);
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }

    public final boolean Eso() {
        return true;
    }
}
