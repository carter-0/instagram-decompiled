package X;

import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.EnumSet;
import org.webrtc.EglBase14Impl;

/* renamed from: X.2qh  reason: invalid class name and case insensitive filesystem */
public final class C230992qh implements C71232bf {
    public final Fragment A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final EnumSet A03;
    public final EnumSet A04;

    public final G6H BAN(2bg r6) {
        int i;
        Object obj;
        if (r6 == null) {
            i = -1;
        } else {
            i = C49292Esb.A00[r6.ordinal()];
        }
        String A002 = C273654mx.A00(8);
        switch (i) {
            case 1:
                obj = new C50820Fj0(this.A00, this.A02);
                break;
            case 2:
                obj = new C50821Fj1(this.A00, this.A02);
                break;
            case 3:
                obj = new C50823Fj3(this.A00.requireActivity(), this.A02);
                break;
            case 4:
                Fragment fragment = this.A00;
                obj = new C50872Fjq(fragment.requireContext(), AnonymousClass07i.A00(fragment), this.A02);
                break;
            case 5:
                obj = new C50870Fjo(this.A00.requireActivity(), this.A02);
                break;
            case 6:
                Fragment fragment2 = this.A00;
                obj = new C50882Fk0(fragment2.requireContext(), fragment2.requireActivity(), AnonymousClass07i.A00(fragment2), this.A02);
                break;
            case 7:
                obj = new C50828Fj8(this.A00.requireActivity(), this.A02);
                break;
            case 8:
                obj = new C50881Fjz(this.A00.requireContext(), this.A02);
                break;
            case 9:
                obj = new C50780FiM(this.A00.requireContext(), this.A02);
                break;
            case 10:
                Fragment fragment3 = this.A00;
                obj = new C50871Fjp(fragment3.requireContext(), AnonymousClass07i.A00(fragment3), this.A02);
                break;
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                obj = new C50877Fjv(this.A00.requireActivity(), this.A02, this.A01.getModuleName());
                break;
            case 13:
                obj = new C50804Fik(this.A00.requireActivity(), this.A02);
                break;
            case 14:
                obj = new C72762PIy(this.A00.requireContext());
                break;
            case 15:
                obj = new C50751Fhq(this.A02);
                break;
            case 16:
                obj = new C50834FjE(this.A00.requireActivity(), this.A02);
                break;
            case 17:
                obj = new C50833FjD(this.A00.requireActivity(), this.A02);
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
                obj = new C50744Fhj(this.A00.requireContext());
                break;
            case 20:
                obj = new C50816Fiw(this.A00.requireActivity(), this.A02);
                break;
            case 21:
                obj = new WZh(this.A00, this.A02);
                break;
            case 22:
                obj = new PJ4(this.A00, this.A02);
                break;
            case 23:
                obj = new C50747Fhm(this.A00);
                break;
            case 24:
                obj = new C50750Fhp(this.A00);
                break;
            case 25:
                obj = new C50749Fho(this.A00);
                break;
            case 26:
                obj = new C50748Fhn(this.A00.requireActivity());
                break;
            case 27:
                Fragment fragment4 = this.A00;
                obj = new C50885Fk3(fragment4.requireActivity(), AnonymousClass07i.A00(fragment4), this.A01, this.A02);
                break;
            case 28:
                obj = new C50753Fhs(this.A02);
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                obj = new C50766Fi8(this.A00.requireActivity(), this.A02);
                break;
            case 30:
            case 31:
            case 32:
                obj = new C50874Fjs(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 33:
                obj = new C50825Fj5(this.A00, this.A02);
                break;
            case 34:
                obj = new C50805Fil(this.A00.requireActivity(), this.A02);
                break;
            case 35:
                obj = new C50827Fj7(this.A00, this.A02);
                break;
            case 36:
                obj = new C50824Fj4(this.A00, this.A02);
                break;
            case 37:
                obj = new C50873Fjr(this.A00, this.A01, this.A02);
                break;
            case 38:
                obj = new C50839FjJ(this.A00, this.A02);
                break;
            case 39:
                obj = new C50842FjM(this.A00, this.A02);
                break;
            case 40:
                obj = new C50797Fid(this.A00, this.A02);
                break;
            case Seq.NULL_REFNUM:
                obj = new C50812Fis(this.A00, this.A02);
                break;
            case Seq.RefTracker.REF_OFFSET:
                obj = new C50822Fj2(this.A00, this.A02);
                break;
            case 43:
                obj = new C50844FjO(this.A00, this.A02);
                break;
            case 44:
                obj = new C50760Fhz(this.A00, this.A02);
                break;
            case 45:
                obj = new C65561Lvl(this.A00, this.A02);
                break;
            case 46:
                obj = new C50835FjF(this.A00, this.A02);
                break;
            case 47:
                obj = new C65562Lvm(this.A00, this.A02);
                break;
            case 48:
                obj = new C50813Fit(this.A00.requireActivity(), this.A02);
                break;
            case 49:
                obj = new C50815Fiv(this.A00, this.A02);
                break;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                obj = new C50817Fix(this.A00, this.A02);
                break;
            case 51:
                obj = new C50838FjI(this.A00, this.A02);
                break;
            case 52:
                obj = new C50843FjN(this.A00, this.A02);
                break;
            case 53:
                obj = new C50840FjK(this.A00, this.A02);
                break;
            case 54:
                obj = new C50830FjA(this.A00, this.A02);
                break;
            case 55:
                obj = new C50841FjL(this.A00, this.A02);
                break;
            case 56:
                obj = new C50831FjB(this.A00, this.A02);
                break;
            case 57:
                obj = new C50818Fiy(this.A00, this.A02);
                break;
            case 58:
                obj = new Fi2(this.A02);
                break;
            case 59:
                Fragment fragment5 = this.A00;
                obj = new C50869Fjn(fragment5.requireContext(), fragment5, this.A02);
                break;
            case 60:
                obj = new C50868Fjm(this.A00.requireContext());
                break;
            case 61:
                Fragment fragment6 = this.A00;
                obj = new C50800Fig(fragment6.requireContext(), fragment6);
                break;
            case 62:
                AnonymousClass4DH r1 = this.A00;
                0qQ.A0C(r1, A002);
                obj = new C50859Fjd(r1, this.A02);
                break;
            case 63:
                AnonymousClass4DH r12 = this.A00;
                0qQ.A0C(r12, A002);
                obj = new C50759Fhy(r12, this.A02);
                break;
            case 64:
                AnonymousClass4DH r13 = this.A00;
                0qQ.A0C(r13, A002);
                obj = new C50860Fje(r13, this.A02);
                break;
            case 65:
                obj = new C50811Fir(this.A00.requireActivity(), this.A02);
                break;
            case 66:
                obj = new C50776FiI(this.A00.requireActivity(), this.A02);
                break;
            case 67:
                obj = new C50777FiJ(this.A00.requireActivity(), this.A02);
                break;
            case 68:
                obj = new C50778FiK(this.A00.requireActivity(), this.A02);
                break;
            case 69:
                obj = new C50775FiH(this.A00.requireActivity(), this.A02);
                break;
            case 70:
                obj = new C50774FiG(this.A00.requireActivity(), this.A02);
                break;
            case 71:
                obj = new C50826Fj6(this.A00.requireActivity(), this.A02);
                break;
            case 72:
                obj = new C50837FjH(this.A00.requireActivity(), this.A02);
                break;
            case 73:
                obj = new C50850FjU(this.A00, this.A02);
                break;
            case 74:
                obj = new C50849FjT(this.A00, this.A02);
                break;
            case 75:
                AnonymousClass4DH r14 = this.A00;
                0qQ.A0C(r14, A002);
                obj = new C57297IWg(r14, this.A02);
                break;
            case 76:
                AnonymousClass4DH r15 = this.A00;
                0qQ.A0C(r15, A002);
                obj = new C57296IWf(r15, this.A02);
                break;
            case 77:
                AnonymousClass4DH r16 = this.A00;
                0qQ.A0C(r16, A002);
                obj = new C57291IWa(r16, this.A02);
                break;
            case 78:
                obj = new C57292IWb(this.A02, this.A00.requireActivity());
                break;
            case 79:
                obj = new IWZ(this.A00, this.A02);
                break;
            case 80:
                obj = new C50798Fie(this.A00.requireActivity(), this.A02);
                break;
            case 81:
                obj = new PJC(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 82:
                obj = new C65556Lvg(this.A00.requireActivity(), this.A02);
                break;
            case 83:
                obj = new C50784FiQ(this.A00.requireActivity(), this.A02);
                break;
            case 84:
                obj = new C50785FiR(this.A00.requireActivity(), this.A02);
                break;
            case 85:
                obj = new C19434WZe(this.A00.requireActivity(), this.A02);
                break;
            case 86:
                obj = new C50756Fhv(this.A00.requireActivity(), this.A02);
                break;
            case 87:
                obj = new C65564Lvo(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 88:
                obj = new C50807Fin(this.A00.requireActivity(), this.A02);
                break;
            case 89:
                obj = new PJ3(this.A00, this.A02);
                break;
            case 90:
                obj = new C50878Fjw(this.A00, this.A01, this.A02);
                break;
            case 91:
                obj = new C50786FiS(this.A00.requireActivity(), this.A02);
                break;
            case 92:
                obj = new C50846FjQ(this.A00, this.A02);
                break;
            case 93:
                obj = new C50746Fhl(this.A00.requireActivity());
                break;
            case 94:
                obj = new C50763Fi5(this.A00.requireActivity(), this.A02);
                break;
            case 95:
                obj = new C50858Fjc(this.A00.requireActivity(), this.A02);
                break;
            case 96:
                obj = new C50788FiU(this.A00.requireActivity(), this.A02);
                break;
            case 97:
                obj = new C50810Fiq(this.A00.requireActivity(), this.A02);
                break;
            case 98:
                obj = new C50790FiW(this.A00.requireActivity(), this.A02);
                break;
            case 99:
                obj = new C50789FiV(this.A00.requireActivity(), this.A02);
                break;
            case 100:
                obj = new C50791FiX(this.A00.requireActivity(), this.A02);
                break;
            case 101:
                obj = new C50866Fjk(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 102:
                obj = new C50845FjP(this.A00.requireActivity(), this.A02);
                break;
            case 103:
                obj = new C50854FjY(this.A00.requireActivity(), this.A02);
                break;
            case 104:
                obj = new C50855FjZ(this.A00.requireActivity(), this.A02);
                break;
            case 105:
                obj = new C50853FjX(this.A00.requireActivity(), this.A02);
                break;
            case 106:
                obj = new C50806Fim(this.A00.requireActivity(), this.A02);
                break;
            case 107:
                obj = new C50771FiD(this.A00, this.A02);
                break;
            case 108:
                obj = new C50781FiN(this.A00.requireContext(), this.A02);
                break;
            case 109:
                obj = new C50743Fhi(this.A00);
                break;
            case 110:
                obj = new C50836FjG(this.A00.requireActivity(), this.A02);
                break;
            case 111:
                Fragment fragment7 = this.A00;
                obj = new C50867Fjl(fragment7.requireActivity(), this.A02, fragment7.mTag);
                break;
            case 112:
                obj = new C50795Fib(this.A00.requireActivity(), this.A02);
                break;
            case 113:
                obj = new C50757Fhw(this.A00, this.A02);
                break;
            case 114:
                obj = new PJ5(this.A00.requireActivity(), this.A02);
                break;
            case 115:
                obj = new PJ2(this.A00.requireContext(), this.A02);
                break;
            case 116:
                obj = new C50832FjC(this.A00.requireActivity(), this.A02);
                break;
            case 117:
                obj = new PJA(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 118:
                obj = new C50802Fii(this.A00.requireActivity(), this.A02);
                break;
            case 119:
                obj = new C50803Fij(this.A00.requireActivity(), this.A02);
                break;
            case 120:
                obj = new C65560Lvk(this.A00.requireActivity(), this.A02);
                break;
            case 121:
            case 122:
                return new C57295IWe(this.A02, this.A00.requireActivity());
            case 123:
                obj = new C57294IWd(this.A00.requireActivity(), this.A02);
                break;
            case 124:
                obj = new Object();
                break;
            case 125:
                obj = new C50799Fif(this.A00, this.A02);
                break;
            case 126:
                obj = new C50880Fjy(this.A00, this.A02);
                break;
            case 127:
                obj = new C65563Lvn(this.A00.requireActivity(), this.A02);
                break;
            case 128:
                obj = new C50752Fhr(this.A00);
                break;
            case 129:
                obj = new C50792FiY(this.A00.requireActivity(), this.A02);
                break;
            case 130:
                obj = new C50848FjS(this.A00.requireActivity(), this.A02);
                break;
            case 131:
                obj = new PJ6(this.A00.requireActivity(), this.A02);
                break;
            case 132:
                obj = new C50876Fju(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 133:
                obj = new C50875Fjt(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 134:
                obj = new C50847FjR(this.A00.requireActivity(), this.A02);
                break;
            case 135:
                obj = new C50762Fi4(this.A00.requireActivity(), this.A02);
                break;
            case 136:
                obj = new Fi1(this.A00.requireActivity(), this.A02);
                break;
            case 137:
                obj = new C50829Fj9(this.A00, this.A02);
                break;
            case 138:
                obj = new C50779FiL(this.A00.requireActivity(), this.A02);
                break;
            case 139:
                obj = new C50883Fk1(this.A00.requireActivity(), this.A02);
                break;
            case 140:
                obj = new C50794Fia(this.A00, this.A02);
                break;
            case 141:
                obj = new C50793FiZ(this.A00, this.A02);
                break;
            case 142:
                obj = new C19436WZg(this.A00.requireActivity(), this.A02);
                break;
            case 143:
                obj = new C50758Fhx(this.A00.requireActivity(), this.A02);
                break;
            case 144:
                obj = new C50761Fi0(this.A00.requireActivity(), this.A02);
                break;
            case 145:
                obj = new C50765Fi7(this.A00, this.A02);
                break;
            case 146:
                obj = new C50767Fi9(this.A00.requireActivity(), this.A02);
                break;
            case 147:
                obj = new C50764Fi6(this.A00.requireActivity(), this.A02);
                break;
            case 148:
                obj = new PJB(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 149:
                Fragment fragment8 = this.A00;
                UserSession userSession = this.A02;
                obj = new WZi(fragment8.requireContext(), fragment8, this.A01, userSession);
                break;
            case 150:
                obj = new C65557Lvh(this.A00, this.A02);
                break;
            case 151:
                obj = new C50772FiE(this.A00, this.A02);
                break;
            case 152:
                obj = new C50745Fhk(this.A02);
                break;
            case 153:
                obj = new C19435WZf(this.A00, this.A02);
                break;
            case 154:
                obj = new C50755Fhu(this.A00.requireActivity(), this.A02);
                break;
            case 155:
                obj = new C50773FiF(this.A00.requireActivity(), this.A02);
                break;
            case 156:
                obj = new PJ8(this.A00.requireContext(), this.A02);
                break;
            case 157:
                obj = new C50754Fht(this.A00.requireActivity());
                break;
            case 158:
                obj = new C50863Fjh(this.A00, this.A01, this.A02);
                break;
            case 159:
                Fragment fragment9 = this.A00;
                obj = new C50865Fjj(fragment9.requireContext(), fragment9.requireActivity(), this.A02);
                break;
            case 160:
                obj = new C50787FiT(this.A00.requireActivity(), this.A02);
                break;
            case 161:
                obj = new C50783FiP(this.A00.requireActivity(), this.A02);
                break;
            case 162:
                obj = new C50782FiO(this.A00.requireContext(), this.A02);
                break;
            case 163:
                obj = new C50852FjW(this.A00.requireActivity(), this.A02);
                break;
            case 164:
                obj = new C50819Fiz(this.A00, this.A02);
                break;
            case 165:
                obj = new C50861Fjf(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 166:
                obj = new C50851FjV(this.A00.requireActivity(), this.A02);
                break;
            case 167:
                obj = new C50856Fja(this.A00.requireActivity(), this.A02);
                break;
            case 168:
                obj = new C50768FiA(this.A00.requireActivity(), this.A02);
                break;
            case 169:
                obj = new PJ0(this.A00.requireActivity(), this.A02);
                break;
            case C11152SCh.MAX_FACTORIAL:
                obj = new C50769FiB(this.A00.requireActivity(), this.A02);
                break;
            case 171:
                obj = new C50770FiC(this.A00.requireActivity(), this.A02);
                break;
            case 172:
                obj = new C50864Fji(this.A00.requireActivity(), this.A01, this.A02);
                break;
            case 173:
                obj = new C65558Lvi(this.A00.requireActivity(), this.A02);
                break;
            case 174:
                obj = new C50857Fjb(this.A00, this.A02);
                break;
            case 175:
                obj = new C50809Fip(this.A00.requireActivity(), this.A02);
                break;
            case 176:
                obj = new C65559Lvj(this.A00.requireActivity(), this.A02);
                break;
            case 177:
                obj = new C50796Fic(this.A00.requireActivity(), this.A02);
                break;
            case 178:
                obj = new Fi3(this.A00.requireActivity(), this.A02);
                break;
            case 179:
                obj = new PJ1(this.A00.requireActivity(), this.A02);
                break;
            case 180:
                obj = new PJ7(this.A00, this.A02);
                break;
            case 181:
                obj = new C50808Fio(this.A00, this.A02);
                break;
            case 182:
                obj = new C50814Fiu(this.A00.requireActivity(), this.A02);
                break;
            case 183:
                obj = new C50801Fih(this.A00, this.A02);
                break;
            case 184:
                AnonymousClass4DH r17 = this.A00;
                0qQ.A0C(r17, A002);
                obj = new C50884Fk2(r17, this.A02);
                break;
            case 185:
                Fragment fragment10 = this.A00;
                obj = new C50862Fjg(fragment10.requireContext(), AnonymousClass07i.A00(fragment10), this.A02);
                break;
            case 186:
                Fragment fragment11 = this.A00;
                obj = new C50879Fjx(fragment11.requireActivity(), fragment11, this.A01, this.A02);
                break;
            case 187:
                obj = new C57293IWc(this.A00.requireActivity(), this.A02);
                break;
            case 188:
                obj = new PJ9(this.A01, this.A02);
                break;
            default:
                return null;
        }
        return (G6H) obj;
    }

    public final EnumSet C3A() {
        return this.A04;
    }

    public C230992qh(Fragment fragment, AnonymousClass0iw r3, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = r3;
        this.A02 = userSession;
        EnumSet<E> allOf = EnumSet.allOf(2bg.class);
        this.A03 = allOf;
        0qQ.A07(allOf);
        this.A04 = allOf;
    }
}
