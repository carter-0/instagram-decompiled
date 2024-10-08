package X;

import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.instagram.common.session.UserSession;
import org.webrtc.CameraCapturer;
import org.webrtc.EglBase14Impl;

public final class DE3 {
    public final UserSession A00;

    public final Long A0W(int i) {
        if (i <= 273) {
            switch (i) {
                case 0:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592554426630752L);
                case 1:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592554427023971L);
                case 2:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592554426958434L);
                case 3:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592554426827361L);
                case 6:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592541541335641L);
                case 8:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592674685452948L);
                case 9:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592674685387411L);
                case 10:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592674685321874L);
                case 14:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991785586773L);
                case EglBase14Impl.EGLExt_SDK_VERSION:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592751994798764L);
                case 19:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592751994733227L);
                case 20:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592567311139433L);
                case 23:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591970310684746L);
                case 24:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592060505063637L);
                case 25:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592567311204970L);
                case 26:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592408397349355L);
                case 58:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592584491205248L);
                case 59:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592584491139711L);
                case 60:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592584491270785L);
                case 71:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043325653141L);
                case 72:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043325325456L);
                case 73:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043325915288L);
                case 74:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043325522067L);
                case 75:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043325128845L);
                case 79:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043325849751L);
                case 80:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043325259919L);
                case 85:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592077684867298L);
                case 86:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593074117280680L);
                case 87:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593074117411754L);
                case 88:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593074117346217L);
                case 91:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592060504998100L);
                case 98:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039757935508L);
                case 99:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039758394263L);
                case 101:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039758459800L);
                case 108:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592545836302939L);
                case 109:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592545836368476L);
                case 110:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592343972839871L);
                case 111:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592343972905408L);
                case 112:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592343973036482L);
                case 113:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592343972970945L);
                case 114:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591888706306093L);
                case 117:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086275916028L);
                case 120:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592395513299410L);
                case 121:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056212127922L);
                case 127:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592545836434013L);
                case 128:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592545836499550L);
                case 134:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971038065411L);
                case 135:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112044671264L);
                case 136:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112044867873L);
                case 137:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112044605727L);
                case 138:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056211472553L);
                case 139:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056211865775L);
                case 142:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039758066582L);
                case 145:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039758001045L);
                case 146:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039757607826L);
                case 147:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086276440318L);
                case 148:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086276309245L);
                case 149:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056211931312L);
                case 150:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056212455606L);
                case 151:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056211669164L);
                case 152:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592399807480284L);
                case 153:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056211734701L);
                case 155:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451347218938L);
                case 162:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593018282771341L);
                case 164:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043325456530L);
                case 165:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043325390993L);
                case 168:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039757738899L);
                case 172:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592034735259782L);
                case 173:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593009692902280L);
                case 174:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593009692836743L);
                case 175:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593009692771206L);
                case 176:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593009692967817L);
                case 182:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592004670685293L);
                case 183:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592004670619756L);
                case 184:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592004670423145L);
                case 185:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592004670554219L);
                case 186:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592004670488682L);
                case 187:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592936678327036L);
                case 188:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592936678523647L);
                case 189:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592936678589184L);
                case 190:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592936678458110L);
                case 191:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592936678392573L);
                case 192:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592889433883374L);
                case 193:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592889433948911L);
                case 194:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592889433686763L);
                case 195:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592889433817837L);
                case 196:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592889433752300L);
                case 197:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592034735325319L);
                case 199:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592932383359739L);
                case 200:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593018282705804L);
                case 202:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592906613555955L);
                case 203:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591974605652043L);
                case 212:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592567311336044L);
                case 213:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592567311270507L);
                case 220:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086276636927L);
                case 221:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592670390354577L);
                case 222:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592764879635117L);
                case 223:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592764879766191L);
                case 224:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592764879700654L);
                case 228:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592107749703966L);
                case 232:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592472821858874L);
                case 241:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592047620096161L);
                case 242:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592047620161698L);
                case 243:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592563016237672L);
                case 244:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592975333294869L);
                case 245:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592975333360406L);
                case 246:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592975333098259L);
                case 248:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592975333032722L);
                case 255:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593048347476899L);
                case 256:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593048347542436L);
                case 263:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591875821404204L);
                case 266:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592185059705178L);
                case 267:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592185059770715L);
                case 268:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592185060163933L);
                case 271:
                    return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592185059049814L);
                default:
                    return null;
            }
        } else if (i <= 547) {
            return A00(i);
        } else {
            if (i <= 821) {
                return A01(i);
            }
            if (i <= 1095) {
                return A02(i);
            }
            if (i <= 1370) {
                return A08(i);
            }
            if (i <= 1644) {
                return A09(i);
            }
            if (i <= 1918) {
                return A0A(i);
            }
            if (i <= 2192) {
                return A0B(i);
            }
            if (i <= 2467) {
                return A0C(i);
            }
            if (i <= 2741) {
                return A0D(i);
            }
            if (i <= 3015) {
                return A0E(i);
            }
            if (i <= 3289) {
                return A0F(i);
            }
            if (i <= 3564) {
                return A03(i);
            }
            if (i <= 3838) {
                return A04(i);
            }
            if (i <= 4112) {
                return A05(i);
            }
            if (i <= 4386) {
                return A06(i);
            }
            return A07(i);
        }
    }

    public final Long A0X(int i) {
        if (i <= 273) {
            switch (i) {
                case 0:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592554426630752L);
                case 1:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592554427023971L);
                case 2:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592554426958434L);
                case 3:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592554426827361L);
                case 6:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592541541335641L);
                case 8:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592674685452948L);
                case 9:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592674685387411L);
                case 10:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592674685321874L);
                case 14:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991785586773L);
                case EglBase14Impl.EGLExt_SDK_VERSION:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592751994798764L);
                case 19:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592751994733227L);
                case 20:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592567311139433L);
                case 23:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591970310684746L);
                case 24:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592060505063637L);
                case 25:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592567311204970L);
                case 26:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592408397349355L);
                case 58:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592584491205248L);
                case 59:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592584491139711L);
                case 60:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592584491270785L);
                case 71:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043325653141L);
                case 72:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043325325456L);
                case 73:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043325915288L);
                case 74:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043325522067L);
                case 75:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043325128845L);
                case 79:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043325849751L);
                case 80:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043325259919L);
                case 85:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592077684867298L);
                case 86:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593074117280680L);
                case 87:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593074117411754L);
                case 88:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593074117346217L);
                case 91:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592060504998100L);
                case 98:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039757935508L);
                case 99:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039758394263L);
                case 101:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039758459800L);
                case 108:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592545836302939L);
                case 109:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592545836368476L);
                case 110:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592343972839871L);
                case 111:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592343972905408L);
                case 112:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592343973036482L);
                case 113:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592343972970945L);
                case 114:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591888706306093L);
                case 117:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086275916028L);
                case 120:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592395513299410L);
                case 121:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056212127922L);
                case 127:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592545836434013L);
                case 128:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592545836499550L);
                case 134:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971038065411L);
                case 135:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112044671264L);
                case 136:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112044867873L);
                case 137:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112044605727L);
                case 138:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056211472553L);
                case 139:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056211865775L);
                case 142:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039758066582L);
                case 145:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039758001045L);
                case 146:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039757607826L);
                case 147:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086276440318L);
                case 148:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086276309245L);
                case 149:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056211931312L);
                case 150:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056212455606L);
                case 151:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056211669164L);
                case 152:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592399807480284L);
                case 153:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056211734701L);
                case 155:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451347218938L);
                case 162:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593018282771341L);
                case 164:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043325456530L);
                case 165:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043325390993L);
                case 168:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039757738899L);
                case 172:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592034735259782L);
                case 173:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593009692902280L);
                case 174:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593009692836743L);
                case 175:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593009692771206L);
                case 176:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593009692967817L);
                case 182:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592004670685293L);
                case 183:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592004670619756L);
                case 184:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592004670423145L);
                case 185:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592004670554219L);
                case 186:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592004670488682L);
                case 187:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592936678327036L);
                case 188:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592936678523647L);
                case 189:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592936678589184L);
                case 190:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592936678458110L);
                case 191:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592936678392573L);
                case 192:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592889433883374L);
                case 193:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592889433948911L);
                case 194:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592889433686763L);
                case 195:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592889433817837L);
                case 196:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592889433752300L);
                case 197:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592034735325319L);
                case 199:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592932383359739L);
                case 200:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593018282705804L);
                case 202:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592906613555955L);
                case 203:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591974605652043L);
                case 212:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592567311336044L);
                case 213:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592567311270507L);
                case 220:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086276636927L);
                case 221:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592670390354577L);
                case 222:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592764879635117L);
                case 223:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592764879766191L);
                case 224:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592764879700654L);
                case 228:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592107749703966L);
                case 232:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592472821858874L);
                case 241:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592047620096161L);
                case 242:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592047620161698L);
                case 243:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592563016237672L);
                case 244:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592975333294869L);
                case 245:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592975333360406L);
                case 246:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592975333098259L);
                case 248:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592975333032722L);
                case 255:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593048347476899L);
                case 256:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593048347542436L);
                case 263:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591875821404204L);
                case 266:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592185059705178L);
                case 267:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592185059770715L);
                case 268:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592185060163933L);
                case 271:
                    return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592185059049814L);
                default:
                    return null;
            }
        } else if (i <= 547) {
            return A0G(i);
        } else {
            if (i <= 821) {
                return A0H(i);
            }
            if (i <= 1095) {
                return A0I(i);
            }
            if (i <= 1370) {
                return A0O(i);
            }
            if (i <= 1644) {
                return A0P(i);
            }
            if (i <= 1918) {
                return A0Q(i);
            }
            if (i <= 2192) {
                return A0R(i);
            }
            if (i <= 2467) {
                return A0S(i);
            }
            if (i <= 2741) {
                return A0T(i);
            }
            if (i <= 3015) {
                return A0U(i);
            }
            if (i <= 3289) {
                return A0V(i);
            }
            if (i <= 3564) {
                return A0J(i);
            }
            if (i <= 3838) {
                return A0K(i);
            }
            if (i <= 4112) {
                return A0L(i);
            }
            if (i <= 4386) {
                return A0M(i);
            }
            return A0N(i);
        }
    }

    public DE3(UserSession userSession) {
        this.A00 = userSession;
    }

    private Long A00(int i) {
        switch (i) {
            case 274:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592481411793468L);
            case 277:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592850778981088L);
            case 283:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592120634540355L);
            case 284:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043325587604L);
            case 285:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043325784214L);
            case 286:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043325194382L);
            case 287:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592382627545542L);
            case 288:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592382627676616L);
            case 289:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592382627611079L);
            case 294:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451347087865L);
            case 295:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983926309696L);
            case 296:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591966015717449L);
            case 302:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592421282316781L);
            case 307:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056212390069L);
            case 308:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592039030161548L);
            case 309:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593052642444197L);
            case 316:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592683275256471L);
            case 317:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592683275387545L);
            case 318:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592683275322008L);
            case 319:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592683275453082L);
            case 320:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592988217934666L);
            case 321:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592988218000203L);
            case 334:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592395513364947L);
            case 341:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056211603627L);
            case 342:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983926178622L);
            case 343:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983925588791L);
            case 344:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983924933424L);
            case 345:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983925654328L);
            case 346:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983926113085L);
            case 347:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983926375233L);
            case 348:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983926047548L);
            case 349:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983925392181L);
            case 350:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983926440770L);
            case 351:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983926506307L);
            case 352:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983925130035L);
            case 353:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983924998961L);
            case 354:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983925261108L);
            case 355:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983925982011L);
            case 356:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983925719865L);
            case 357:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983925785402L);
            case 358:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983925064498L);
            case 359:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983925523254L);
            case 373:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592185059901788L);
            case 382:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592013260357742L);
            case 385:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592928088392442L);
            case 390:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592386922774990L);
            case 393:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592185059246424L);
            case 398:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056212258995L);
            case 399:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056211538090L);
            case 401:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056212062385L);
            case 402:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983926244159L);
            case 403:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592395513561558L);
            case 404:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592395513168336L);
            case 405:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592395513430484L);
            case 406:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592395513496021L);
            case 407:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592395513233873L);
            case 408:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592395513102799L);
            case 420:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592975333229332L);
            case 421:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592975333425943L);
            case 425:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592185059311961L);
            case 426:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404103365088L);
            case 430:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404103168477L);
            case 434:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592571606172273L);
            case 435:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592588785975942L);
            case 436:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592588786041479L);
            case 437:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591978900684877L);
            case 438:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081980096739L);
            case 439:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592571606106736L);
            case 440:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592571606237810L);
            case 444:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867231469590L);
            case 446:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991785521236L);
            case 453:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592743404798631L);
            case 456:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592000375455848L);
            case 457:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592185059115351L);
            case 458:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979628000029L);
            case 465:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592593080943243L);
            case 466:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592073390031073L);
            case 467:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592528656433752L);
            case 470:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592064799965398L);
            case 474:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404103299551L);
            case 475:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591978900619340L);
            case 478:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404103234014L);
            case 479:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592700455191197L);
            case 480:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777764733620L);
            case 481:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056211800238L);
            case 484:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592189354017120L);
            case 486:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592842189046494L);
            case 494:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056212652215L);
            case 497:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592137814409548L);
            case 498:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404103692769L);
            case CameraCapturer.OPEN_CAMERA_DELAY_MS:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592481411924541L);
            case 501:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592820714275549L);
            case 502:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592820714210012L);
            case 503:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593082707215279L);
            case 504:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056212324532L);
            case 509:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592597375976077L);
            case 510:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592597375910540L);
            case 511:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081980162276L);
            case 515:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592408397414892L);
            case 516:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404103758306L);
            case 517:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592481411990078L);
            case 518:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591927361011771L);
            case 519:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592116339573048L);
            case 520:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592116339638585L);
            case 521:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592116339704122L);
            case 523:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081980293349L);
            case 526:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592588786107016L);
            case 527:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592129224606022L);
            case 528:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592129224474948L);
            case 529:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592129224540485L);
            case 531:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592455641989680L);
            case 532:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087002182576L);
            case 533:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087002248113L);
            case 534:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087002313650L);
            case 535:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087002379187L);
            case 541:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979628065566L);
            case 542:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592013260423279L);
            default:
                return null;
        }
    }

    private Long A01(int i) {
        switch (i) {
            case 551:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081980358886L);
            case 558:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591983195652176L);
            case 559:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592137814475085L);
            case 560:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592567311401581L);
            case 561:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794944406220L);
            case 563:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794944471757L);
            case 564:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591983195717713L);
            case 565:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591996080554086L);
            case 568:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081980686567L);
            case 570:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087002706872L);
            case 571:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087002772409L);
            case 572:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087002575798L);
            case 573:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087002444724L);
            case 574:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087002641335L);
            case 575:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592842189112031L);
            case 576:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794944602831L);
            case 577:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794944537294L);
            case 578:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592511476564567L);
            case 579:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591987490553939L);
            case 581:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043325980825L);
            case 582:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043326046362L);
            case 585:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592618850878096L);
            case 588:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592210828853609L);
            case 590:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081980948712L);
            case 591:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777764864693L);
            case 593:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794944668368L);
            case 594:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087002510261L);
            case 595:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087002837946L);
            case 596:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591781332123651L);
            case 597:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591781332189188L);
            case 599:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593091297280963L);
            case 600:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593095592117188L);
            case 602:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593104182051781L);
            case 604:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081981079785L);
            case 606:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593117066953671L);
            case 607:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592064800030935L);
            case 609:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592588786172553L);
            case 611:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777765192378L);
            case 612:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777764930230L);
            case 613:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777764995767L);
            case 614:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777765061304L);
            case 615:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777765126841L);
            case 616:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592034735587464L);
            case 617:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056212783289L);
            case 618:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056212717752L);
            case 621:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592064800096472L);
            case 624:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593164311593954L);
            case 627:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591983195848786L);
            case 628:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593207261266921L);
            case 629:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593207261332458L);
            case 630:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593207261397995L);
            case 631:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081981276394L);
            case 632:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592455642055217L);
            case 633:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777765323451L);
            case 637:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777765454525L);
            case 638:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777765388988L);
            case 641:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777765520062L);
            case 642:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777765585599L);
            case 643:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777765651136L);
            case 644:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777765716673L);
            case 645:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271685776380L);
            case 646:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271685841917L);
            case 648:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593258800874488L);
            case 650:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593275980743755L);
            case 651:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593280275711052L);
            case 652:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087002903483L);
            case 653:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593267390809083L);
            case 654:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593293160612942L);
            case 655:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593297455580239L);
            case 656:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593301750547536L);
            case 661:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592210828919146L);
            case 670:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039758787481L);
            case 674:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593323225384034L);
            case 675:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593323225449571L);
            case 678:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593331815318629L);
            case 679:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593331815384166L);
            case 680:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593331815449703L);
            case 681:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593331815515240L);
            case 682:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043326111899L);
            case 684:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593336110285930L);
            case 685:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593336110351467L);
            case 686:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593336110417004L);
            case 687:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593336110482541L);
            case 688:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593340405253239L);
            case 693:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348995253370L);
            case 695:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348995384443L);
            case 696:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348995449980L);
            case 697:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348995515517L);
            case 698:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348995581054L);
            case 699:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348995646591L);
            case 701:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348995777664L);
            case 702:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348995843201L);
            case 703:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348995908738L);
            case 704:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348995974275L);
            case 705:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996039812L);
            case 706:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996105349L);
            case 707:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996170886L);
            case 708:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996236423L);
            case 709:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996301960L);
            case 710:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996367497L);
            case 711:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996433034L);
            case 712:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996498571L);
            case 714:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593190081397731L);
            case 715:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593301750678609L);
            case 716:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593383354926301L);
            case 717:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387649959137L);
            case 718:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387649893600L);
            case 720:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593409124795647L);
            case 725:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996629644L);
            case 726:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996695181L);
            case 742:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081981538539L);
            case 744:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592185060426078L);
            case 745:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593439189501184L);
            case 746:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452074599738L);
            case 747:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452074665275L);
            case 748:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452074730812L);
            case 749:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452074796349L);
            case 750:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452074861886L);
            case 751:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452074927423L);
            case 752:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452074992960L);
            case 753:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452075058497L);
            case 754:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452075124034L);
            case 755:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452074403127L);
            case 756:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452074468664L);
            case 757:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452074534201L);
            case 758:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593250211070966L);
            case 759:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592902318719728L);
            case 760:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593301750744146L);
            case 761:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271685907454L);
            case 762:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996760718L);
            case 763:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996826255L);
            case 764:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996891792L);
            case 765:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520793879899L);
            case 766:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593529383880049L);
            case 767:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593537973749106L);
            case 768:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593537973814643L);
            case 769:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593537973880180L);
            case 770:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593499319108942L);
            case 772:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593301750875219L);
            case 773:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039759246234L);
            case 774:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348997022866L);
            case 775:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348996957329L);
            case 778:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593250211136503L);
            case 779:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443485189386L);
            case 780:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443485058312L);
            case 781:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443485254923L);
            case 782:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443485320460L);
            case 783:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443485385997L);
            case 784:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443484468481L);
            case 785:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443484534018L);
            case 786:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443484599555L);
            case 787:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443484665092L);
            case 788:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443484730629L);
            case 789:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443484796166L);
            case 790:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443484861703L);
            case 791:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443485123849L);
            case 792:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592545836696159L);
            case 793:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979628131103L);
            case 794:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979628196640L);
            case 795:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979628262177L);
            case 796:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979628327714L);
            case 797:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593499319174479L);
            case 799:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593555153683830L);
            case 801:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271686300674L);
            case 802:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271686366211L);
            case 803:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271686169601L);
            case 804:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271685972991L);
            case 805:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271686038528L);
            case 806:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593589513356673L);
            case 807:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593117067019208L);
            case 808:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636758062487L);
            case 809:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636758128024L);
            case 810:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636757996950L);
            case 811:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593645347931586L);
            case 813:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983926899524L);
            case 815:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593563743618424L);
            case 816:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593563743749497L);
            case 817:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593563743815034L);
            case 818:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593563743552887L);
            case 819:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867232321564L);
            case 820:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867232387101L);
            case 821:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867232452638L);
            default:
                return null;
        }
    }

    private Long A02(int i) {
        switch (i) {
            case 822:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867232124955L);
            case 823:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867231600663L);
            case 824:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867231666200L);
            case 825:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867231731737L);
            case 826:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867232583711L);
            case 827:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777765978818L);
            case 829:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593632463029653L);
            case 830:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794944799442L);
            case 831:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794944733905L);
            case 833:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794944996051L);
            case 834:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794945061588L);
            case 838:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593606693225870L);
            case 839:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593606693356943L);
            case 844:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593649643095494L);
            case 845:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593649642964420L);
            case 846:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593649643029957L);
            case 847:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593649642898883L);
            case 848:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348997153939L);
            case 849:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593649643161031L);
            case 850:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348997219476L);
            case 851:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348997285013L);
            case 852:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039759311771L);
            case 853:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593666822768078L);
            case 854:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593666822899151L);
            case 858:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636758193561L);
            case 859:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636758324634L);
            case 860:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979628458787L);
            case 862:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991785783382L);
            case 863:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991785914455L);
            case 865:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593718362375642L);
            case 866:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593748427146720L);
            case 867:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593748427277793L);
            case 868:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404103823843L);
            case 869:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593752722179554L);
            case 871:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081981866220L);
            case 872:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112045064482L);
            case 873:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593761312048617L);
            case 874:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593765607015914L);
            case 875:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593765607081451L);
            case 876:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593765607146988L);
            case 878:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593778491983345L);
            case 883:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593787081852405L);
            case 885:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979628589860L);
            case 888:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112045261091L);
            case 891:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592047620227235L);
            case 903:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593778492179954L);
            case 904:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593787081917942L);
            case 905:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593855801329159L);
            case 906:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271686431748L);
            case 907:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271686497285L);
            case 908:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271686562822L);
            case 909:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593847211394563L);
            case 910:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593847211460100L);
            case 911:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593817146623487L);
            case 917:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593804261787129L);
            case 918:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452075386179L);
            case 919:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592064800227546L);
            case 920:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592064800293083L);
            case 921:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592064800358620L);
            case 922:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592064800489693L);
            case 923:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592064800162009L);
            case 924:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404103889380L);
            case 925:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593885866100237L);
            case 926:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056213242042L);
            case 929:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593894456034830L);
            case 930:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593894456100367L);
            case 934:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593903045969427L);
            case 935:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593903046034964L);
            case 936:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593104182117318L);
            case 938:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594134974203477L);
            case 939:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594122089301574L);
            case 940:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593765607343598L);
            case 941:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593765607278061L);
            case 942:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979628655397L);
            case 943:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593778492245491L);
            case 944:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593860096296459L);
            case 946:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348997350550L);
            case 947:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594165038974553L);
            case 948:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594165039040090L);
            case 951:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056213504187L);
            case 952:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594160744007256L);
            case 954:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348997547161L);
            case 957:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443485582606L);
            case 958:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443485648143L);
            case 959:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443485713680L);
            case 960:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594190808778376L);
            case 962:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348997416087L);
            case 963:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348997481624L);
            case 964:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591781332385797L);
            case 968:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169334203995L);
            case 971:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043326177436L);
            case 972:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971038393095L);
            case 973:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971038130948L);
            case 974:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971038196485L);
            case 975:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971038262022L);
            case 976:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971038524169L);
            case 977:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971038458632L);
            case 978:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229463484053L);
            case 979:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592064800555230L);
            case 981:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593499319305552L);
            case 983:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451347612155L);
            case 984:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593207261529068L);
            case 985:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081982521581L);
            case 987:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443486172436L);
            case 988:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443486237973L);
            case 989:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443485910289L);
            case 990:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443486041362L);
            case 991:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443486106899L);
            case 992:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056213569724L);
            case 993:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594255233353381L);
            case 996:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081982783726L);
            case 998:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271686628359L);
            case 999:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112045457700L);
            case IgNetworkConsentStorage.MAX_ENTRIES /*1000*/:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594263823287975L);
            case 1001:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594263823222438L);
            case 1024:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039759639453L);
            case 1025:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039759573916L);
            case 1026:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979628720934L);
            case 1027:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443486369046L);
            case 1029:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594311067862699L);
            case 1032:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594323952764590L);
            case 1033:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971039048464L);
            case 1034:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971038720779L);
            case 1035:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971038786316L);
            case 1036:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971038851853L);
            case 1037:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971038917390L);
            case 1038:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971038982927L);
            case 1039:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971038655242L);
            case 1040:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594332542699183L);
            case 1041:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594332542830256L);
            case 1042:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081982980335L);
            case 1048:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867231797274L);
            case 1049:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594203693745803L);
            case 1050:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594203693811340L);
            case 1051:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594203693876877L);
            case 1052:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594203693680266L);
            case 1053:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592734815191713L);
            case 1054:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593117067084745L);
            case 1055:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594285298058921L);
            case 1059:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594371197470405L);
            case 1060:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451347677692L);
            case 1061:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081983111408L);
            case 1062:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983926965061L);
            case 1064:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594384082306760L);
            case 1065:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594384082372297L);
            case 1066:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592129225064775L);
            case 1067:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592129225130312L);
            case 1068:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592129225195849L);
            case 1069:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592129225261386L);
            case 1070:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592129225326923L);
            case 1072:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594315362895532L);
            case 1073:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594315362961069L);
            case 1078:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594371197601478L);
            case 1079:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594371197667015L);
            case 1080:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592764879831728L);
            case 1088:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594422737471189L);
            case 1089:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594422737012433L);
            case 1092:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594422737209042L);
            case 1094:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594422737340115L);
            case 1095:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594422737405652L);
            default:
                return null;
        }
    }

    private Long A03(int i) {
        switch (i) {
            case 3290:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454259296723L);
            case 3291:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599688367050348L);
            case 3292:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175084259686L);
            case 3296:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271690626091L);
            case 3297:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288208891033L);
            case 3300:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600736338939874L);
            case 3301:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087072087435L);
            case 3302:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600736339005411L);
            case 3303:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596548746152476L);
            case 3304:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724840532575L);
            case 3305:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724840598112L);
            case 3306:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724840794723L);
            case 3307:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724840663649L);
            case 3308:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724840729186L);
            case 3309:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636761601464L);
            case 3310:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636761667001L);
            case 3311:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600792173514733L);
            case 3312:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600792173580270L);
            case 3313:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600792173711343L);
            case 3314:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598563085618404L);
            case 3315:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598563085552867L);
            case 3316:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349003904210L);
            case 3317:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175084652907L);
            case 3318:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600813648351222L);
            case 3319:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600809353383924L);
            case 3320:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600263893258047L);
            case 3321:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600263893126973L);
            case 3322:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600263893192510L);
            case 3324:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387651400944L);
            case 3325:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387651466481L);
            case 3328:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759929617344L);
            case 3329:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600487230836616L);
            case 3331:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600487231033225L);
            case 3333:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594422738257627L);
            case 3334:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759929813953L);
            case 3335:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351282194L);
            case 3336:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349004035283L);
            case 3337:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991786569822L);
            case 3338:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214683850L);
            case 3339:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214290628L);
            case 3340:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214356165L);
            case 3341:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214421702L);
            case 3342:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214487239L);
            case 3343:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214552776L);
            case 3344:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214618313L);
            case 3345:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349004100820L);
            case 3346:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288209611939L);
            case 3347:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288209218718L);
            case 3348:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288209284255L);
            case 3349:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454260214238L);
            case 3350:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454260279775L);
            case 3351:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288208956570L);
            case 3352:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288209022107L);
            case 3353:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288209087644L);
            case 3354:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288209153181L);
            case 3355:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288209349792L);
            case 3356:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288209480865L);
            case 3357:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288209546402L);
            case 3358:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593207262118896L);
            case 3359:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351413267L);
            case 3360:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349003773136L);
            case 3361:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349003838673L);
            case 3362:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349003707599L);
            case 3364:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593610989700498L);
            case 3366:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593258801791994L);
            case 3367:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596548746283550L);
            case 3368:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596548746218013L);
            case 3369:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596548746349087L);
            case 3370:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351478804L);
            case 3371:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454260345312L);
            case 3372:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454260410849L);
            case 3373:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883755109031L);
            case 3374:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883755174568L);
            case 3375:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883755240105L);
            case 3376:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759929879490L);
            case 3377:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804990019426L);
            case 3378:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724840991332L);
            case 3380:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991786635359L);
            case 3381:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601006921879624L);
            case 3382:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601006921945161L);
            case 3384:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925317959734L);
            case 3385:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925318025271L);
            case 3386:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925318090808L);
            case 3387:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925318156345L);
            case 3388:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925318221882L);
            case 3389:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925318287419L);
            case 3390:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925318352956L);
            case 3391:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925318418493L);
            case 3392:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925318484030L);
            case 3393:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925318549567L);
            case 3394:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925318615104L);
            case 3395:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925317500975L);
            case 3396:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925317566512L);
            case 3397:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925317632049L);
            case 3398:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925317697586L);
            case 3399:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925317763123L);
            case 3400:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925317828660L);
            case 3401:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925317894197L);
            case 3402:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597880185752622L);
            case 3403:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794945585881L);
            case 3406:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271690757164L);
            case 3407:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271690822701L);
            case 3408:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601049871683674L);
            case 3409:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601049871880284L);
            case 3410:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601049871814747L);
            case 3411:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601049871552600L);
            case 3412:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601049871618137L);
            case 3413:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599654007246440L);
            case 3414:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271690888238L);
            case 3415:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597540883336024L);
            case 3416:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837238635532L);
            case 3417:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271690953775L);
            case 3418:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600989742272582L);
            case 3419:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600989742207045L);
            case 3420:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600989742141508L);
            case 3421:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600989742338119L);
            case 3422:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601049871945821L);
            case 3424:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593610989766035L);
            case 3425:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601122885996654L);
            case 3426:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216650256152L);
            case 3427:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596548746414624L);
            case 3428:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592584491860610L);
            case 3429:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592567311598191L);
            case 3430:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271691019312L);
            case 3431:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596892343339694L);
            case 3432:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443492726070L);
            case 3433:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593323225646180L);
            case 3434:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600843713122304L);
            case 3435:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257417263882L);
            case 3436:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257417329419L);
            case 3437:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257417394956L);
            case 3438:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598537315945696L);
            case 3439:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600792173842416L);
            case 3442:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387651990770L);
            case 3444:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595569493674163L);
            case 3446:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799467733L);
            case 3448:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799533270L);
            case 3449:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079210974916L);
            case 3450:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079211040453L);
            case 3451:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079211105990L);
            case 3452:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079211171527L);
            case 3453:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601157245997176L);
            case 3454:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601157245735028L);
            case 3455:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601157245800565L);
            case 3456:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601157245866102L);
            case 3457:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601157245931639L);
            case 3458:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594916659234790L);
            case 3459:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594916659300327L);
            case 3460:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216650583833L);
            case 3462:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351544341L);
            case 3464:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349004231893L);
            case 3469:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351675415L);
            case 3470:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351740952L);
            case 3471:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351806489L);
            case 3472:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351872026L);
            case 3473:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351609878L);
            case 3474:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601298979655814L);
            case 3475:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351937563L);
            case 3476:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837238701069L);
            case 3477:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837238766606L);
            case 3478:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601384879067291L);
            case 3479:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601384879001754L);
            case 3480:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601384879132828L);
            case 3481:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451352003100L);
            case 3483:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601397764034724L);
            case 3484:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601397764100261L);
            case 3485:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601397764165798L);
            case 3487:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601397764296871L);
            case 3488:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601397764362408L);
            case 3490:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592584491926147L);
            case 3491:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600538770575257L);
            case 3494:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593301751989336L);
            case 3496:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601402058870953L);
            case 3497:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601470778347724L);
            case 3499:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601402058936490L);
            case 3500:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601371994099862L);
            case 3501:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601371994165399L);
            case 3502:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601371994230936L);
            case 3503:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601492253184215L);
            case 3504:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601492253249752L);
            case 3505:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601492253315289L);
            case 3506:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454260738532L);
            case 3507:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454260804069L);
            case 3508:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454260541922L);
            case 3509:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454260607459L);
            case 3510:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601522317955292L);
            case 3511:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601500843184346L);
            case 3512:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595118522173466L);
            case 3514:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601560972660974L);
            case 3515:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642577367296L);
            case 3516:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642577432833L);
            case 3517:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601049872207966L);
            case 3518:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642577236222L);
            case 3519:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642577301759L);
            case 3521:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079211237064L);
            case 3522:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079211302601L);
            case 3523:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799664343L);
            case 3524:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593301752054873L);
            case 3525:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601664051876145L);
            case 3526:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595655392692447L);
            case 3528:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600925318746177L);
            case 3529:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087072218509L);
            case 3530:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601719886450998L);
            case 3531:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601719886516535L);
            case 3532:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601719886582072L);
            case 3533:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601719886647609L);
            case 3535:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087072152972L);
            case 3536:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599443554242069L);
            case 3537:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599885935873683L);
            case 3539:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452076369223L);
            case 3540:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601419238740144L);
            case 3541:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601419238805681L);
            case 3542:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601419238871218L);
            case 3543:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601419238936755L);
            case 3544:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601419239002292L);
            case 3546:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112047292725L);
            case 3548:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837238897679L);
            case 3550:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597609602878310L);
            case 3551:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214749387L);
            case 3552:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592047620292772L);
            case 3553:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349004297430L);
            case 3558:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601874505273708L);
            case 3559:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593610989831572L);
            case 3560:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451352199709L);
            case 3561:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596754904648300L);
            case 3564:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592902318850801L);
            default:
                return null;
        }
    }

    private Long A04(int i) {
        switch (i) {
            case 3566:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601719886713146L);
            case 3567:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454260869606L);
            case 3568:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596754904582763L);
            case 3569:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214814924L);
            case 3570:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214880461L);
            case 3571:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837238963216L);
            case 3572:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837239028753L);
            case 3573:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960404619652L);
            case 3574:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960404947335L);
            case 3575:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960405012872L);
            case 3576:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960404816261L);
            case 3577:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960404881798L);
            case 3578:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601981879456147L);
            case 3579:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056215011535L);
            case 3580:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214945998L);
            case 3581:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651167039763L);
            case 3582:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651167105300L);
            case 3583:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087072284046L);
            case 3588:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597880185818159L);
            case 3589:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599326138L);
            case 3590:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599391675L);
            case 3591:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599457212L);
            case 3592:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599522749L);
            case 3593:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599588286L);
            case 3594:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599653823L);
            case 3595:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599719360L);
            case 3596:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599784897L);
            case 3597:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599850434L);
            case 3598:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599915971L);
            case 3599:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599981508L);
            case ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS /*3600*/:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050598932916L);
            case 3601:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050598998453L);
            case 3602:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599063990L);
            case 3603:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599129527L);
            case 3604:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599195064L);
            case 3605:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050599260601L);
            case 3606:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288209677476L);
            case 3607:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288209743013L);
            case 3608:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602067778802207L);
            case 3609:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651167170837L);
            case 3610:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451352265246L);
            case 3611:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597472164842309L);
            case 3612:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059189588440L);
            case 3613:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059189653977L);
            case 3614:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059189850588L);
            case 3615:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059189916125L);
            case 3616:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059189981662L);
            case 3617:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059189391829L);
            case 3618:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059189457366L);
            case 3619:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063484490235L);
            case 3620:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063484555772L);
            case 3621:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063484621309L);
            case 3622:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063484686846L);
            case 3623:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063484752383L);
            case 3624:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063484817920L);
            case 3625:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063484883457L);
            case 3626:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063484948994L);
            case 3627:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063484359161L);
            case 3628:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063484424698L);
            case 3630:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059189719514L);
            case 3631:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059189785051L);
            case 3632:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059189522903L);
            case 3633:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600147928747759L);
            case 3634:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642577563907L);
            case 3635:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642577498370L);
            case 3636:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642577629444L);
            case 3638:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059190112736L);
            case 3639:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063485014531L);
            case 3640:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063485080068L);
            case 3641:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059190047199L);
            case 3642:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651167236374L);
            case 3643:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598313977515179L);
            case 3644:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598313977580716L);
            case 3647:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651167301911L);
            case 3648:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651167367448L);
            case 3649:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593207262184433L);
            case 3650:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592047620358309L);
            case 3652:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594886595119062L);
            case 3653:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454260935143L);
            case 3654:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454261000680L);
            case 3655:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601719886778683L);
            case 3656:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601719886844220L);
            case 3657:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601719886909757L);
            case 3658:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601719886975294L);
            case 3659:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592047620423846L);
            case 3660:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593804262049276L);
            case 3661:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602578879976109L);
            case 3663:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601122886193263L);
            case 3664:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452076500297L);
            case 3665:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452076434760L);
            case 3666:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570290565785L);
            case 3667:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570290631322L);
            case 3668:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570290696859L);
            case 3669:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799926491L);
            case 3670:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799992028L);
            case 3671:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087800057565L);
            case 3672:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087800123102L);
            case 3674:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799729880L);
            case 3675:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799795417L);
            case 3676:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799860954L);
            case 3677:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642577694981L);
            case 3678:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601006922141770L);
            case 3679:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087800254175L);
            case 3680:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570289975954L);
            case 3681:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570290041491L);
            case 3682:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570290107028L);
            case 3683:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570290172565L);
            case 3685:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570290303638L);
            case 3686:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570290369175L);
            case 3688:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570290500248L);
            case 3689:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593301752120410L);
            case 3691:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209668660L);
            case 3692:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595655392757984L);
            case 3693:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636761929148L);
            case 3694:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636761798074L);
            case 3695:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636761863611L);
            case 3696:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592047620554920L);
            case 3697:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960405143946L);
            case 3698:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960405209483L);
            case 3699:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960405078409L);
            case 3700:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837239094290L);
            case 3701:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651167629593L);
            case 3702:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837239159827L);
            case 3703:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349005018327L);
            case 3704:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454261459435L);
            case 3705:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454261656044L);
            case 3706:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454261721581L);
            case 3707:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454261197289L);
            case 3708:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454261393898L);
            case 3709:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592047620489383L);
            case 3710:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063485145605L);
            case 3711:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063485211142L);
            case 3712:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063485276679L);
            case 3713:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063485342216L);
            case 3714:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063485407753L);
            case 3715:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063485473290L);
            case 3716:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059190178273L);
            case 3717:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059190243810L);
            case 3718:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059190309347L);
            case 3719:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059190374884L);
            case 3720:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059190440421L);
            case 3721:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059190505958L);
            case 3722:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651167695130L);
            case 3723:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595638213282012L);
            case 3724:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454261787118L);
            case 3738:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602613239648947L);
            case 3739:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830767425471L);
            case 3740:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830767491008L);
            case 3741:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830767556545L);
            case 3742:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830767622082L);
            case 3743:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830767687619L);
            case 3744:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830767359934L);
            case 3745:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601290389983364L);
            case 3746:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039761212322L);
            case 3747:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602630419518142L);
            case 3748:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593383355057375L);
            case 3749:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759929945027L);
            case 3750:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759930010564L);
            case 3751:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759930076101L);
            case 3752:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601981879587220L);
            case 3753:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600792173973489L);
            case 3754:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086280306961L);
            case 3755:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602673369191109L);
            case 3756:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991786897504L);
            case 3757:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602639009452736L);
            case 3758:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451352330783L);
            case 3759:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602733498864364L);
            case 3760:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602733498929901L);
            case 3761:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602733498995438L);
            case 3762:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602733498798827L);
            case 3763:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271691084849L);
            case 3764:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602742088667887L);
            case 3765:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602742088733424L);
            case 3766:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602742088864497L);
            case 3767:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991786963041L);
            case 3771:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867233435688L);
            case 3772:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867233501225L);
            case 3773:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867233239077L);
            case 3774:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867233304614L);
            case 3775:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867233370151L);
            case 3776:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651167760667L);
            case 3777:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789333373699L);
            case 3778:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789333439236L);
            case 3779:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789333504773L);
            case 3780:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789333570310L);
            case 3781:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789333635847L);
            case 3782:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789333701384L);
            case 3783:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789333766921L);
            case 3784:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789333832458L);
            case 3785:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789333897995L);
            case 3786:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789333963532L);
            case 3787:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789334029069L);
            case 3788:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789334094606L);
            case 3789:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789334160143L);
            case 3790:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789334225680L);
            case 3791:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789334291217L);
            case 3792:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789334356754L);
            case 3793:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789334422291L);
            case 3794:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059190571495L);
            case 3795:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063485538827L);
            case 3796:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789334487828L);
            case 3797:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789333308162L);
            case 3798:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991787028578L);
            case 3800:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602806513242928L);
            case 3801:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602806513308465L);
            case 3802:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602806513177391L);
            case 3803:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602853758210877L);
            case 3804:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602853758276414L);
            case 3806:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680504823756L);
            case 3807:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680504889293L);
            case 3808:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680504758219L);
            case 3809:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602806513374002L);
            case 3810:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601006922207307L);
            case 3811:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601006922272844L);
            case 3812:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602883822588743L);
            case 3813:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602883822654280L);
            case 3814:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602883822719817L);
            case 3815:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602922477294417L);
            case 3816:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602922477359954L);
            case 3817:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602922477425491L);
            case 3818:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602922477491028L);
            case 3819:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602922477556565L);
            case 3822:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602935362261846L);
            case 3823:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602939657163607L);
            case 3824:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050600047045L);
            case 3825:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271691150386L);
            case 3826:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050600178119L);
            case 3827:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050600243656L);
            case 3828:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050600309193L);
            case 3829:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050600112582L);
            case 3830:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642578153734L);
            case 3831:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642578219271L);
            case 3832:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216650911514L);
            case 3833:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603029851476837L);
            case 3834:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642578284808L);
            case 3835:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603055621280614L);
            case 3836:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271691215923L);
            case 3837:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837239225364L);
            case 3838:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209865271L);
            default:
                return null;
        }
    }

    private Long A05(int i) {
        switch (i) {
            case 3839:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209930808L);
            case 3840:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209734197L);
            case 3841:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209799734L);
            case 3842:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596754904713837L);
            case 3843:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595354745309312L);
            case 3844:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830767753156L);
            case 3845:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603162995463036L);
            case 3847:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991787094115L);
            case 3848:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216650977051L);
            case 3849:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216651042588L);
            case 3850:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603180175332223L);
            case 3851:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087072415119L);
            case 3852:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603124341019512L);
            case 3853:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603124340822903L);
            case 3855:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056215470291L);
            case 3856:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056215273680L);
            case 3857:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056215339217L);
            case 3858:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056215404754L);
            case 3859:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059190637032L);
            case 3860:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059190702569L);
            case 3861:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063485604364L);
            case 3862:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063485669901L);
            case 3863:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789334553365L);
            case 3864:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789334618902L);
            case 3865:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593894456296977L);
            case 3866:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651167826204L);
            case 3867:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603253189776275L);
            case 3869:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501503019538L);
            case 3870:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501503085075L);
            case 3871:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501502954001L);
            case 3872:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387652056307L);
            case 3873:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597472164907846L);
            case 3874:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603300434416542L);
            case 3875:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603300434482079L);
            case 3876:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651167957277L);
            case 3877:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599563813260884L);
            case 3878:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651168022814L);
            case 3879:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603347679056800L);
            case 3880:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602617534943925L);
            case 3881:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602617534878388L);
            case 3882:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837239290901L);
            case 3883:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837239356438L);
            case 3884:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314705485292L);
            case 3885:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314705550829L);
            case 3887:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602617535206071L);
            case 3888:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602617535271608L);
            case 3889:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602617535337145L);
            case 3890:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451352396320L);
            case 3891:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451352461857L);
            case 3892:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651168088351L);
            case 3893:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454261918191L);
            case 3894:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271691478068L);
            case 3895:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271691543605L);
            case 3896:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991787159652L);
            case 3899:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602617535140534L);
            case 3900:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593778492704244L);
            case 3902:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271691609142L);
            case 3904:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601006922338381L);
            case 3905:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603502298010544L);
            case 3906:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603502298076081L);
            case 3907:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603502298141618L);
            case 3908:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603502297879470L);
            case 3909:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603502297945007L);
            case 3910:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603480823042985L);
            case 3911:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603480823108522L);
            case 3912:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603480823174059L);
            case 3913:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603480823239596L);
            case 3914:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603480823305133L);
            case 3916:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642578546953L);
            case 3917:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883755305642L);
            case 3918:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883755371179L);
            case 3919:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593009693033354L);
            case 3920:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050600374730L);
            case 3921:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079211368138L);
            case 3922:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601049872273503L);
            case 3923:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603356268991393L);
            case 3924:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602673369387718L);
            case 3926:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602617535533754L);
            case 3927:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603390628729762L);
            case 3928:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600843713777671L);
            case 3929:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600843713712134L);
            case 3931:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600843713581060L);
            case 3932:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600843713187841L);
            case 3933:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600843713646597L);
            case 3934:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600843713318914L);
            case 3935:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600843713384451L);
            case 3936:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603180175397760L);
            case 3937:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603180175463297L);
            case 3938:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603180175528834L);
            case 3939:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598064869608536L);
            case 3940:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867233566762L);
            case 3941:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867233697835L);
            case 3942:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288209808550L);
            case 3943:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288209874087L);
            case 3944:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603180175594371L);
            case 3945:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651168153888L);
            case 3947:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594792104527704L);
            case 3948:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063486128657L);
            case 3949:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063486194194L);
            case 3950:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789334881047L);
            case 3951:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789334946584L);
            case 3952:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789335012121L);
            case 3953:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789335077658L);
            case 3954:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789335143195L);
            case 3955:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059190964714L);
            case 3956:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059191030251L);
            case 3957:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059191095788L);
            case 3958:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059191161325L);
            case 3959:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059191226862L);
            case 3960:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063485932046L);
            case 3961:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063485997583L);
            case 3962:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063486063120L);
            case 3963:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651168219425L);
            case 3964:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454261983728L);
            case 3965:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603626851931078L);
            case 3966:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804990084963L);
            case 3967:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570290762396L);
            case 3969:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603583902258112L);
            case 3971:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059191357935L);
            case 3972:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063486325267L);
            case 3973:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789335274268L);
            case 3976:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960405340557L);
            case 3977:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960405406094L);
            case 3978:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960405471631L);
            case 3979:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960405537168L);
            case 3980:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960405602705L);
            case 3981:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601960405275020L);
            case 3982:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314705681902L);
            case 3983:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314705747439L);
            case 3984:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314705812976L);
            case 3985:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520795059556L);
            case 3986:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063486521877L);
            case 3987:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789335339805L);
            case 3988:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789335470878L);
            case 3989:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063486390804L);
            case 3991:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372654197160L);
            case 3992:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257417460493L);
            case 3993:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209996345L);
            case 3994:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050600440267L);
            case 3995:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600263893323584L);
            case 3997:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680505020366L);
            case 3998:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050600505804L);
            case 3999:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603824420426709L);
            case 4001:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603562427421622L);
            case 4002:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598064869674073L);
            case 4003:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603858780361694L);
            case 4004:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603858780427231L);
            case 4005:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603858780492768L);
            case 4006:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603858780558305L);
            case 4007:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603858780623842L);
            case 4008:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603858780689379L);
            case 4009:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603858780754916L);
            case 4010:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603858780820453L);
            case 4011:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603858780230620L);
            case 4012:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603858780296157L);
            case 4014:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454262049265L);
            case 4015:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059191489008L);
            case 4016:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063486652950L);
            case 4017:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789335601951L);
            case 4018:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598726294375691L);
            case 4019:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059191751154L);
            case 4020:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063486718487L);
            case 4021:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063486915096L);
            case 4022:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789335667488L);
            case 4023:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789335929633L);
            case 4024:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059191554545L);
            case 4025:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087072546192L);
            case 4026:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087072611729L);
            case 4029:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602806513439539L);
            case 4030:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36603162995528573L);
            case 4032:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602617535730363L);
            case 4033:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789336060706L);
            case 4034:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059191882227L);
            case 4035:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063487046169L);
            case 4036:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979630097199L);
            case 4037:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520795190629L);
            case 4038:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063487111706L);
            case 4039:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789336126243L);
            case 4040:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059192013301L);
            case 4041:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063487177243L);
            case 4042:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789336191780L);
            case 4043:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059191947764L);
            case 4044:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597880185883696L);
            case 4045:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597880185949233L);
            case 4046:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050600571341L);
            case 4047:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050600636878L);
            case 4048:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050600702415L);
            case 4049:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050600767952L);
            case 4050:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602617535795900L);
            case 4051:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604090708530179L);
            case 4053:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593847211787782L);
            case 4054:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593804262114813L);
            case 4056:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636761994685L);
            case 4057:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451352592930L);
            case 4058:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050600899025L);
            case 4059:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604150837941269L);
            case 4061:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604163722843158L);
            case 4062:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597815761374177L);
            case 4063:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600809353449461L);
            case 4064:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604210967483422L);
            case 4065:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600813648416759L);
            case 4068:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597609602943847L);
            case 4069:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593331815580777L);
            case 4070:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520795256166L);
            case 4071:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594126385514066L);
            case 4073:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602806513570612L);
            case 4078:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604421420880944L);
            case 4080:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604442895717433L);
            case 4081:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600538770837402L);
            case 4083:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349006132441L);
            case 4084:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349006066904L);
            case 4085:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271691740215L);
            case 4086:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271691805752L);
            case 4087:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592902319244018L);
            case 4088:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642578940173L);
            case 4089:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642578612490L);
            case 4091:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642578743563L);
            case 4092:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642578809100L);
            case 4094:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604378471207980L);
            case 4095:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387652121844L);
            case 4097:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651168416034L);
            case 4101:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680505282511L);
            case 4102:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680505675729L);
            case 4103:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680505610192L);
            case 4104:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604627579311174L);
            case 4105:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604687708918876L);
            case 4106:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604687708984413L);
            case 4107:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604687708853339L);
            case 4108:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804990412644L);
            case 4109:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804990478181L);
            case 4110:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837239618583L);
            case 4112:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604752133428322L);
            default:
                return null;
        }
    }

    private Long A06(int i) {
        switch (i) {
            case 4113:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349006197978L);
            case 4114:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597815761439714L);
            case 4117:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604765018264679L);
            case 4118:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651168481571L);
            case 4119:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604425715848241L);
            case 4120:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599795741167223L);
            case 4121:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601006922403918L);
            case 4122:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601006922469455L);
            case 4123:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314706140657L);
            case 4124:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680505806802L);
            case 4125:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804990543718L);
            case 4126:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789336257317L);
            case 4127:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059192078838L);
            case 4128:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063487242780L);
            case 4129:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543725181099L);
            case 4130:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604923932120189L);
            case 4131:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604923932185726L);
            case 4132:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604923932054652L);
            case 4133:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605044191138993L);
            case 4135:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759930141638L);
            case 4136:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759930207175L);
            case 4137:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759930272712L);
            case 4138:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112047358262L);
            case 4139:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759930338249L);
            case 4140:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759930403786L);
            case 4141:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759930469323L);
            case 4142:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759930534860L);
            case 4144:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759930600397L);
            case 4145:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759930665934L);
            case 4146:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759930731471L);
            case 4147:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604773608199272L);
            case 4148:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604773608264809L);
            case 4149:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404104348137L);
            case 4150:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595625328511188L);
            case 4151:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595625328576725L);
            case 4152:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595625328642262L);
            case 4153:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595625328445651L);
            case 4157:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592382628331980L);
            case 4159:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991787225189L);
            case 4160:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604872392447090L);
            case 4161:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680505937875L);
            case 4162:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592906613752564L);
            case 4163:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592382628397517L);
            case 4164:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297594602717L);
            case 4165:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297594668254L);
            case 4166:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297594733791L);
            case 4167:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297594209495L);
            case 4168:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297594275032L);
            case 4169:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297594340569L);
            case 4170:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297594406106L);
            case 4171:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297594471643L);
            case 4172:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297594537180L);
            case 4173:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605052781073586L);
            case 4174:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605379198588143L);
            case 4177:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314706533875L);
            case 4180:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592906613818101L);
            case 4181:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592584492450437L);
            case 4182:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592584492384900L);
            case 4183:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086280503571L);
            case 4184:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086280438034L);
            case 4185:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314706206194L);
            case 4186:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605112910615736L);
            case 4187:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605112910681273L);
            case 4188:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605228874732753L);
            case 4189:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605228874798290L);
            case 4190:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830767818693L);
            case 4191:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883755567788L);
            case 4192:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297594930401L);
            case 4193:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297594995938L);
            case 4194:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297594799328L);
            case 4195:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297595061475L);
            case 4198:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086280569108L);
            case 4199:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605615421789464L);
            case 4202:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605563882181903L);
            case 4205:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599851575742078L);
            case 4206:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595170062239809L);
            case 4207:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595170062305346L);
            case 4208:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595170062370883L);
            case 4209:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452076565834L);
            case 4210:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602742089126643L);
            case 4211:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602742089061106L);
            case 4212:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596754904779374L);
            case 4214:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605301889176808L);
            case 4216:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601006922666065L);
            case 4217:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601006922600528L);
            case 4218:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605873119892812L);
            case 4219:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605868824859977L);
            case 4220:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605868824925514L);
            case 4221:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605873119827275L);
            case 4222:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314706730484L);
            case 4224:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454262114802L);
            case 4225:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602742089192180L);
            case 4226:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520795452775L);
            case 4227:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271691936826L);
            case 4228:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271691871289L);
            case 4230:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570290893469L);
            case 4232:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452076631371L);
            case 4233:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595028327860228L);
            case 4234:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595028327925765L);
            case 4235:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595028327991302L);
            case 4236:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595028327729154L);
            case 4237:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595028327794691L);
            case 4238:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606289731655028L);
            case 4239:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606289731720565L);
            case 4240:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606255371916655L);
            case 4241:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451352658467L);
            case 4242:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451352724004L);
            case 4243:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606379926033826L);
            case 4244:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570291024543L);
            case 4245:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570291090080L);
            case 4246:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570291155617L);
            case 4247:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570290959006L);
            case 4248:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602742089257717L);
            case 4249:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602742089323254L);
            case 4251:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606397105837485L);
            case 4253:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087072677266L);
            case 4254:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087072742803L);
            case 4255:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837239749656L);
            case 4256:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593589514077573L);
            case 4258:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606491595118011L);
            case 4260:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604872392578164L);
            case 4261:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604872392840309L);
            case 4262:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604872392905846L);
            case 4263:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606616149169630L);
            case 4264:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604872392971383L);
            case 4265:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604872392512627L);
            case 4266:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606616149235167L);
            case 4268:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611854202316L);
            case 4269:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611854267853L);
            case 4270:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611854333390L);
            case 4271:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606379926164899L);
            case 4273:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600813648547832L);
            case 4274:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601088526389355L);
            case 4275:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600843713843208L);
            case 4276:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372654262697L);
            case 4277:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372654328234L);
            case 4279:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520795518312L);
            case 4280:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606852372436472L);
            case 4281:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606852372829690L);
            case 4282:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606852372764153L);
            case 4283:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606848077403639L);
            case 4284:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591978900881487L);
            case 4285:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606929681782271L);
            case 4286:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606470120347057L);
            case 4287:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602939657229144L);
            case 4288:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611854529999L);
            case 4289:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611854661073L);
            case 4290:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611854595536L);
            case 4291:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087072808340L);
            case 4292:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087072873877L);
            case 4293:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087072939414L);
            case 4294:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642579398929L);
            case 4295:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642579136782L);
            case 4296:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642579202319L);
            case 4297:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601642579267856L);
            case 4298:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607101480474125L);
            case 4299:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611854726610L);
            case 4300:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607118660343311L);
            case 4301:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607015581128200L);
            case 4302:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594126385579603L);
            case 4309:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600843713908745L);
            case 4310:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371337475484L);
            case 4311:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371337737632L);
            case 4312:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371337541021L);
            case 4313:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371337803169L);
            case 4314:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371337606558L);
            case 4315:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371337278873L);
            case 4316:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371337344410L);
            case 4317:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336164744L);
            case 4318:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336230281L);
            case 4319:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336295818L);
            case 4320:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336361355L);
            case 4321:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336426892L);
            case 4322:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336492429L);
            case 4323:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336557966L);
            case 4324:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336623503L);
            case 4325:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336689040L);
            case 4326:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336754577L);
            case 4327:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336820114L);
            case 4328:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336885651L);
            case 4329:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336951188L);
            case 4330:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371337016725L);
            case 4331:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336033670L);
            case 4332:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371337409947L);
            case 4333:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371336099207L);
            case 4334:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371337672095L);
            case 4335:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371337082262L);
            case 4336:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371337147799L);
            case 4337:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606371337213336L);
            case 4338:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601088526520428L);
            case 4339:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598064869739610L);
            case 4341:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602806513832758L);
            case 4342:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602806513701685L);
            case 4343:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607110070408718L);
            case 4344:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600813648613369L);
            case 4346:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607324818773543L);
            case 4347:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607324818839080L);
            case 4348:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607324818904617L);
            case 4349:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607324818970154L);
            case 4350:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607324819035691L);
            case 4351:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607324819101228L);
            case 4352:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607324819166765L);
            case 4353:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611854923219L);
            case 4355:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050601095635L);
            case 4356:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050601030098L);
            case 4357:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830767949767L);
            case 4358:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830759823215L);
            case 4359:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830759888752L);
            case 4360:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830768015304L);
            case 4361:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830768080841L);
            case 4362:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830768146378L);
            case 4363:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830759561068L);
            case 4364:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830767884230L);
            case 4365:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594126385645140L);
            case 4366:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271692002363L);
            case 4367:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520795583849L);
            case 4368:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680506200020L);
            case 4369:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592734815716006L);
            case 4370:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607466552694347L);
            case 4372:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087003296703L);
            case 4373:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651168547108L);
            case 4374:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570291352228L);
            case 4375:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570291417765L);
            case 4376:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570291221154L);
            case 4377:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570291286691L);
            case 4378:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605731391018289L);
            case 4379:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605731391804722L);
            case 4380:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605731391870259L);
            case 4381:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605731391935796L);
            case 4382:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598159358758006L);
            case 4383:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598159358823543L);
            case 4384:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598159358889080L);
            case 4385:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607694185961062L);
            case 4386:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680506265557L);
            default:
                return null;
        }
    }

    private Long A07(int i) {
        switch (i) {
            case 4387:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680506462167L);
            case 4388:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680506331094L);
            case 4389:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607754315503221L);
            case 4390:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607599696680543L);
            case 4391:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601006922731602L);
            case 4392:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601006922797139L);
            case 4393:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601006922928212L);
            case 4394:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570291483302L);
            case 4395:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607883164522119L);
            case 4396:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372654590379L);
            case 4397:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611855054292L);
            case 4399:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271692067900L);
            case 4400:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271692133437L);
            case 4401:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607986243737233L);
            case 4402:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608024898508435L);
            case 4403:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349006329051L);
            case 4404:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349006394588L);
            case 4405:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600813648678906L);
            case 4406:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608140862625436L);
            case 4407:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608140862690973L);
            case 4408:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608140862756510L);
            case 4409:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608140862559899L);
            case 4410:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570291745448L);
            case 4411:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570291679911L);
            case 4412:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604872393036920L);
            case 4413:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651168612645L);
            case 4414:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794945651418L);
            case 4415:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602742089388791L);
            case 4416:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602742089454328L);
            case 4417:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595217306421341L);
            case 4418:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595221601388645L);
            case 4419:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608334136088230L);
            case 4420:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608334136153767L);
            case 4421:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680506527704L);
            case 4423:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314706796021L);
            case 4424:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404104413674L);
            case 4425:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608450100205263L);
            case 4426:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271692198974L);
            case 4427:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431579825L);
            case 4428:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431645362L);
            case 4432:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431710899L);
            case 4433:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431776436L);
            case 4434:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431841973L);
            case 4435:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431907510L);
            case 4436:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431973047L);
            case 4437:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338432038584L);
            case 4438:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338432104121L);
            case 4439:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338432169658L);
            case 4440:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338432235195L);
            case 4441:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431055529L);
            case 4442:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431121066L);
            case 4443:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431186603L);
            case 4444:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431252140L);
            case 4445:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431317677L);
            case 4446:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431383214L);
            case 4447:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338432300732L);
            case 4448:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431448751L);
            case 4449:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338431514288L);
            case 4450:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608381380728516L);
            case 4451:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297595127012L);
            case 4452:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608527409616601L);
            case 4453:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602050601161172L);
            case 4454:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608523114649304L);
            case 4455:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608621898897122L);
            case 4456:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608621898962659L);
            case 4457:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608660553602797L);
            case 4458:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608651963668200L);
            case 4459:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608651963864811L);
            case 4460:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608651963930348L);
            case 4461:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608651963733737L);
            case 4462:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608651963799274L);
            case 4463:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608334136219304L);
            case 4465:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608780812687104L);
            case 4466:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600813648744443L);
            case 4467:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600813648809980L);
            case 4469:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608381380794053L);
            case 4470:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608381380859590L);
            case 4471:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608381380925127L);
            case 4472:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609021330855699L);
            case 4473:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570291810985L);
            case 4474:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601290390048901L);
            case 4475:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175949678378L);
            case 4476:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602806514029368L);
            case 4477:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602806513963831L);
            case 4478:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593009693098891L);
            case 4479:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601122886389873L);
            case 4480:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601122886455410L);
            case 4481:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601122886324336L);
            case 4482:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595195831781453L);
            case 4483:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950137134L);
            case 4485:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175949809451L);
            case 4486:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175949874988L);
            case 4487:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950071597L);
            case 4488:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271692264511L);
            case 4489:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271692330048L);
            case 4490:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271692395585L);
            case 4491:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593731247408604L);
            case 4492:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591927361863742L);
            case 4493:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591927361929279L);
            case 4494:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591927361994816L);
            case 4495:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609347748370273L);
            case 4496:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789336322854L);
            case 4497:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602789336388391L);
            case 4498:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059192144375L);
            case 4499:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602059192209912L);
            case 4500:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063487373853L);
            case 4501:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602063487439390L);
            case 4502:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950202671L);
            case 4503:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36607466552759884L);
            case 4504:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36602570291876522L);
            case 4505:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598593150323946L);
            case 4506:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271692461122L);
            case 4507:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950333745L);
            case 4508:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950399282L);
            case 4509:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950464819L);
            case 4510:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950268208L);
            case 4511:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608780812752641L);
            case 4512:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950530356L);
            case 4513:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950595893L);
            case 4514:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950661430L);
            case 4515:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950726967L);
            case 4516:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950792504L);
            case 4517:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680506593241L);
            case 4518:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338432366269L);
            case 4519:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271692526659L);
            case 4520:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636762060222L);
            case 4521:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636762125759L);
            case 4522:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636762191296L);
            case 4523:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636762256833L);
            case 4524:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680506658778L);
            case 4525:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608338432431806L);
            case 4526:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611855185366L);
            case 4527:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611855119829L);
            case 4528:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950858041L);
            case 4529:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950923578L);
            case 4530:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175950989115L);
            case 4531:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175951054652L);
            case 4532:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175951120189L);
            case 4533:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175951185726L);
            case 4534:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175951251263L);
            case 4535:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175951316800L);
            case 4536:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175951382337L);
            case 4537:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175951447874L);
            case 4538:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175951513411L);
            case 4539:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609055690725145L);
            case 4540:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609055690594072L);
            case 4541:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609055690987292L);
            case 4542:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609055691052829L);
            case 4543:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609055690856218L);
            case 4544:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609055690921755L);
            case 4545:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595097047861268L);
            case 4546:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596943883733702L);
            case 4547:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175951644485L);
            case 4548:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609175951578948L);
            case 4550:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609858849478592L);
            case 4551:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609858849675202L);
            case 4552:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609858849609665L);
            case 4553:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451353510437L);
            case 4554:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609949043791815L);
            case 4555:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608527409682138L);
            case 4556:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271692657733L);
            case 4557:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271692592196L);
            case 4558:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271692723270L);
            case 4559:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611855447511L);
            case 4560:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611855513048L);
            case 4562:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36610172382091242L);
            case 4563:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36610172382156779L);
            case 4564:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36610172382222316L);
            case 4565:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36610271166339059L);
            case 4566:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520795714922L);
            case 4567:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297595258086L);
            case 4568:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297595192549L);
            case 4570:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087003427776L);
            case 4571:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271693050952L);
            case 4572:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271692985415L);
            case 4573:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604773608395882L);
            case 4574:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520795780459L);
            case 4575:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36610468734834689L);
            case 4576:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605297595520231L);
            case 4577:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271693116489L);
            case 4578:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271693182026L);
            case 4579:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611855644121L);
            case 4580:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599417784307210L);
            case 4581:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651168678182L);
            case 4582:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36601651168743719L);
            case 4583:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611855775194L);
            case 4584:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36610451555293184L);
            case 4585:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36610451555031037L);
            case 4586:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36610451555096574L);
            case 4587:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36610451555162111L);
            case 4588:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314706927094L);
            case 4589:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759930797008L);
            case 4590:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36610833807055012L);
            case 4591:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598159358954617L);
            case 4592:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520795845996L);
            case 4593:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520795911533L);
            case 4594:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609055691118366L);
            case 4595:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609055691183903L);
            case 4596:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609055691249440L);
            case 4597:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611855971803L);
            case 4598:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611856037340L);
            case 4599:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087003493313L);
            case 4600:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597880186211378L);
            case 4601:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451353575974L);
            case 4602:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608780812883715L);
            case 4603:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608780812818178L);
            case 4604:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36608780812949252L);
            case 4605:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597880186276915L);
            case 4606:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597880186342452L);
            case 4607:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777767027401L);
            case 4608:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611499526985959L);
            case 4609:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451353641511L);
            case 4610:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594783514396499L);
            case 4611:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520795977070L);
            case 4612:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451353772585L);
            case 4613:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451353838122L);
            case 4614:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451353707048L);
            case 4615:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847419730199L);
            case 4616:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847419795736L);
            case 4617:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847419468051L);
            case 4618:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847419533588L);
            case 4619:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847419599125L);
            case 4620:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847419664662L);
            case 4621:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847419336977L);
            case 4622:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847419402514L);
            case 4623:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520796042607L);
            case 4624:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611856009271584L);
            case 4625:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36605615421855001L);
            case 4626:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520796108144L);
            case 4627:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451353903659L);
            case 4628:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451353969196L);
            case 4629:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451354034733L);
            case 4630:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451354100270L);
            case 4631:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36612238261360950L);
            case 4632:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847419861273L);
            case 4633:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847419926810L);
            case 4635:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847420057883L);
            case 4636:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847420123420L);
            case 4637:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847420188957L);
            case 4638:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847420254494L);
            case 4639:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36611847420320031L);
            case 4640:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372654655916L);
            case 4641:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592674686173846L);
            case 4642:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175084783980L);
            case 4643:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36609949043857352L);
            case 4644:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606379926230436L);
            case 4645:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451354165807L);
            case 4646:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36606611856102877L);
            case 4648:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36612332750969155L);
            case 4649:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36612332751034692L);
            case 4650:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36612332751296839L);
            case 4651:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36612332750903618L);
            case 4652:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36612332751100229L);
            case 4653:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36612332751427912L);
            case 4654:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36612332751231302L);
            case 4655:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36612324160772417L);
            case 4656:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592906614014710L);
            case 4657:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36612534614104409L);
            case 4658:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36604163722908695L);
            case 4659:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112047423799L);
            case 4660:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087003689922L);
            case 4661:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804990674791L);
            default:
                return null;
        }
    }

    private Long A08(int i) {
        switch (i) {
            case 1096:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593336110613614L);
            case 1097:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593336110679151L);
            case 1098:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443486500119L);
            case 1103:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594457096750821L);
            case 1104:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594461391718119L);
            case 1106:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594452802176738L);
            case 1107:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594452801783516L);
            case 1108:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594452801849053L);
            case 1109:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594452801914590L);
            case 1110:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594452801980127L);
            case 1111:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594452802045664L);
            case 1112:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594452802111201L);
            case 1117:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452075713860L);
            case 1119:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593791376885239L);
            case 1120:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594512931325681L);
            case 1122:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594482866554603L);
            case 1123:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594538701129472L);
            case 1124:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443486565656L);
            case 1125:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443486631193L);
            case 1126:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443486827803L);
            case 1127:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443486762266L);
            case 1128:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594508636358382L);
            case 1130:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777766109891L);
            case 1131:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592034735653001L);
            case 1134:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594525816227570L);
            case 1140:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594555880998664L);
            case 1143:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451348070909L);
            case 1146:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593855801394696L);
            case 1147:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991786045528L);
            case 1153:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443487352092L);
            case 1154:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443487548703L);
            case 1155:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443487417629L);
            case 1156:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443487483166L);
            case 1157:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594590240737053L);
            case 1158:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594620305508142L);
            case 1159:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594620305573679L);
            case 1160:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594620305639216L);
            case 1161:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593499319371089L);
            case 1165:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594422737536726L);
            case 1167:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594603125638950L);
            case 1169:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591781332451334L);
            case 1171:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592382627873225L);
            case 1172:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594650370279220L);
            case 1173:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594637485377331L);
            case 1174:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594654665246517L);
            case 1176:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593718362441179L);
            case 1177:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271686693896L);
            case 1178:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636758455707L);
            case 1181:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594573061195531L);
            case 1182:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594701909886779L);
            case 1183:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594714794788670L);
            case 1184:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594126384793163L);
            case 1185:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594126384858700L);
            case 1186:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594126384924237L);
            case 1187:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594126384989774L);
            case 1188:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594126384662089L);
            case 1189:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594126384727626L);
            case 1190:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594654665377590L);
            case 1192:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086277554433L);
            case 1193:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086277488896L);
            case 1194:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086277619970L);
            case 1195:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443487679776L);
            case 1196:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594727679821636L);
            case 1197:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594727679887173L);
            case 1202:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594727679690562L);
            case 1203:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594727679756099L);
            case 1204:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387650024674L);
            case 1205:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594770629363534L);
            case 1206:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594783514265426L);
            case 1207:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594744859559754L);
            case 1208:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594573061457676L);
            case 1210:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594792104200020L);
            case 1211:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594779219494737L);
            case 1212:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594779219429200L);
            case 1213:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594671845115703L);
            case 1214:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594671845181240L);
            case 1215:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594762039428941L);
            case 1217:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593589513749890L);
            case 1218:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086277685507L);
            case 1219:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086277751044L);
            case 1220:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804989101913L);
            case 1221:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804989167450L);
            case 1222:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594452802307811L);
            case 1223:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271686956042L);
            case 1224:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271686890505L);
            case 1225:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594813579036520L);
            case 1228:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830758905706L);
            case 1229:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086277947653L);
            case 1231:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086278078726L);
            case 1232:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592064800620767L);
            case 1233:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594843643807691L);
            case 1234:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594822168971113L);
            case 1236:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594860823676877L);
            case 1237:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594852233742284L);
            case 1239:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591978900815950L);
            case 1241:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594882298513362L);
            case 1242:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594508636423919L);
            case 1246:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404104085990L);
            case 1247:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404104020453L);
            case 1248:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594869413611470L);
            case 1249:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594869413677007L);
            case 1257:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594886593480659L);
            case 1258:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594886593546196L);
            case 1259:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594886593611733L);
            case 1267:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591781332516871L);
            case 1274:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086278406407L);
            case 1275:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086278471944L);
            case 1276:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348997612698L);
            case 1279:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594920953219048L);
            case 1286:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592734815257250L);
            case 1295:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594963902957556L);
            case 1296:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594916658382814L);
            case 1297:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594916658448351L);
            case 1299:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086278537481L);
            case 1300:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595028327401469L);
            case 1301:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595028327467006L);
            case 1302:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595028327532543L);
            case 1307:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594959607990254L);
            case 1308:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593301750940756L);
            case 1312:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086278603018L);
            case 1313:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594457096816358L);
            case 1317:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595011147597819L);
            case 1320:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595071277074444L);
            case 1325:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086278734092L);
            case 1326:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086278668555L);
            case 1327:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595071277139981L);
            case 1328:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595071277205518L);
            case 1329:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595041212368905L);
            case 1331:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520794469725L);
            case 1332:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520794535262L);
            case 1333:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520794600799L);
            case 1334:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520794666336L);
            case 1335:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520794731873L);
            case 1336:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520794797410L);
            case 1337:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520794404188L);
            case 1338:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043326242973L);
            case 1339:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043326308510L);
            case 1340:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594959608055791L);
            case 1341:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387650090211L);
            case 1342:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595131406616615L);
            case 1343:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348997678235L);
            case 1351:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595135701583916L);
            case 1353:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595122816682011L);
            case 1354:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595118521911320L);
            case 1355:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595118521976857L);
            case 1356:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595118521714709L);
            case 1357:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595118521780246L);
            case 1358:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595118521845783L);
            case 1359:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595131406682152L);
            case 1360:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979628917543L);
            case 1361:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595127111714845L);
            case 1363:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595127111845918L);
            case 1364:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595127111911455L);
            case 1365:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595127111976992L);
            case 1366:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595127112042529L);
            case 1367:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595127111649308L);
            case 1369:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595139996551217L);
            case 1370:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595139996616754L);
            default:
                return null;
        }
    }

    private Long A09(int i) {
        switch (i) {
            case 1371:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595139996682291L);
            case 1372:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595165766354999L);
            case 1373:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595165766420536L);
            case 1374:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595165766486073L);
            case 1375:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271687021579L);
            case 1376:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595148586485813L);
            case 1379:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595097046878223L);
            case 1380:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595097047009296L);
            case 1381:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595170061322298L);
            case 1384:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591781332582408L);
            case 1385:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595208716027989L);
            case 1388:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595182946224196L);
            case 1390:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595195831126086L);
            case 1391:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595217306028119L);
            case 1392:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595217306093656L);
            case 1393:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595217306159193L);
            case 1394:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595217306224730L);
            case 1395:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595217306290267L);
            case 1396:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595217306355804L);
            case 1397:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595221600929886L);
            case 1398:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595221600995423L);
            case 1399:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595221601060960L);
            case 1400:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595221601126497L);
            case 1401:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595221601192034L);
            case 1402:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595221601257571L);
            case 1403:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595217305962582L);
            case 1404:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595221601323108L);
            case 1406:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595191536158789L);
            case 1412:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443487941921L);
            case 1413:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443488007458L);
            case 1415:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056213700798L);
            case 1416:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056213635261L);
            case 1417:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443488072995L);
            case 1418:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595251665832040L);
            case 1419:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595251665766503L);
            case 1420:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595251665700966L);
            case 1422:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348997743772L);
            case 1429:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595135701649453L);
            case 1430:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595135701714990L);
            case 1431:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595028327598080L);
            case 1433:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348997809309L);
            case 1434:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595277435504746L);
            case 1435:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595281730472044L);
            case 1436:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443488269606L);
            case 1437:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443488138532L);
            case 1438:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443488204069L);
            case 1439:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271687087116L);
            case 1440:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593520794862947L);
            case 1444:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592975333557017L);
            case 1445:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592975333622554L);
            case 1446:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592975333688091L);
            case 1447:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592975333753628L);
            case 1448:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592975333491480L);
            case 1450:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595316090210420L);
            case 1451:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595316090341493L);
            case 1452:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595350449948792L);
            case 1453:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595350450014329L);
            case 1454:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595350450079866L);
            case 1455:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595354744916091L);
            case 1456:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592116340097340L);
            case 1457:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592116340162877L);
            case 1458:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592116340228414L);
            case 1459:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592116340031803L);
            case 1460:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593855801460233L);
            case 1461:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593855801591306L);
            case 1463:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086278865165L);
            case 1467:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593589513815427L);
            case 1468:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595298910341232L);
            case 1469:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593117067215818L);
            case 1470:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595389104654477L);
            case 1471:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593207261594605L);
            case 1472:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594727679952710L);
            case 1473:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594727680018247L);
            case 1474:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593903046362648L);
            case 1475:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593903046100501L);
            case 1476:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593903046166038L);
            case 1477:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593903046231575L);
            case 1478:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387650155748L);
            case 1479:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387650221285L);
            case 1480:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593610988717456L);
            case 1481:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112045785384L);
            case 1482:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112045850921L);
            case 1483:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112045916458L);
            case 1484:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112045981995L);
            case 1485:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112046047532L);
            case 1486:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112045588773L);
            case 1487:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112045654310L);
            case 1488:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112045719847L);
            case 1490:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592116340359488L);
            case 1491:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592116340425025L);
            case 1492:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592116340293951L);
            case 1493:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592395513889240L);
            case 1495:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592395513823703L);
            case 1496:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056213766335L);
            case 1498:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087002969020L);
            case 1499:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087003034557L);
            case 1502:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595436349294738L);
            case 1506:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592395513954777L);
            case 1510:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595131406747689L);
            case 1511:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595470709033108L);
            case 1525:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830761265026L);
            case 1526:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830760675194L);
            case 1527:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830760740731L);
            case 1528:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830760806268L);
            case 1529:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830760871805L);
            case 1530:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830761330563L);
            case 1531:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830761396100L);
            case 1532:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830758971243L);
            case 1533:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830760937342L);
            case 1534:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830759954289L);
            case 1535:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830760019826L);
            case 1536:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830760085363L);
            case 1537:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830760150900L);
            case 1538:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830761068415L);
            case 1539:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830761133952L);
            case 1540:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830760281973L);
            case 1541:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830760347510L);
            case 1542:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830760413047L);
            case 1543:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830760478584L);
            case 1544:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830760544121L);
            case 1545:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830761199489L);
            case 1547:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591996080750695L);
            case 1548:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593499319436626L);
            case 1557:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593860096361996L);
            case 1562:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593087003100094L);
            case 1564:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451349250558L);
            case 1565:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595569493346478L);
            case 1566:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595569493280941L);
            case 1567:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543724329126L);
            case 1568:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543723477147L);
            case 1569:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543723542684L);
            case 1571:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543723673757L);
            case 1572:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543723739294L);
            case 1573:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543723804831L);
            case 1574:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543723870368L);
            case 1575:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543723935905L);
            case 1576:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543724001442L);
            case 1577:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543724066979L);
            case 1578:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543724132516L);
            case 1579:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543724198053L);
            case 1580:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443488531751L);
            case 1581:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443488597288L);
            case 1582:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443488924969L);
            case 1583:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443489056042L);
            case 1585:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056213831872L);
            case 1586:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595354744981628L);
            case 1587:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591781332647945L);
            case 1588:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592481412055615L);
            case 1589:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592567311532654L);
            case 1591:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991786111065L);
            case 1594:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595097047074833L);
            case 1595:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086278996238L);
            case 1596:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086279061775L);
            case 1597:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595131406813226L);
            case 1601:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595599558052038L);
            case 1602:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595633917855961L);
            case 1603:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595633917790424L);
            case 1607:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593336111006832L);
            case 1608:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443489318187L);
            case 1609:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830761527173L);
            case 1611:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595655392626910L);
            case 1612:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595131406944299L);
            case 1613:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595659687594209L);
            case 1614:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595651097725149L);
            case 1615:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595629622823127L);
            case 1618:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592034735784074L);
            case 1619:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595638212757722L);
            case 1621:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595625327855818L);
            case 1622:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595625327921355L);
            case 1623:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595625327986892L);
            case 1624:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595625328052429L);
            case 1625:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595694047398116L);
            case 1627:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593207261791214L);
            case 1628:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595694047332579L);
            case 1629:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595694047463653L);
            case 1634:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592734815322787L);
            case 1635:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271687545869L);
            case 1638:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595706932234476L);
            case 1640:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595277435570283L);
            case 1641:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595281730537581L);
            case 1642:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595702637267175L);
            case 1643:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595702637332712L);
            case 1644:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595702637398249L);
            default:
                return null;
        }
    }

    private Long A0A(int i) {
        switch (i) {
            case 1645:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595702637463786L);
            case 1646:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595702637529323L);
            case ReactTextInputManager.IME_ACTION_ID:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595689752365282L);
            case 1655:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595316090472566L);
            case 1656:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595754176874743L);
            case 1657:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595758471842040L);
            case 1658:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594126385055311L);
            case 1659:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348998333598L);
            case 1660:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348998464671L);
            case 1661:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595728407070963L);
            case 1662:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595706932365550L);
            case 1666:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595706932300013L);
            case 1667:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591781332713482L);
            case 1668:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595711227201778L);
            case 1670:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595797126547712L);
            case 1673:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595810011449602L);
            case 1678:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595852961122573L);
            case 1679:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595706932431087L);
            case 1681:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595814306482438L);
            case 1682:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595814306416901L);
            case 1685:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794945323733L);
            case 1688:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595857256155408L);
            case 1690:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039760753566L);
            case 1696:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591927361142844L);
            case 1702:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595810011515139L);
            case 1705:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595943155435799L);
            case 1706:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595943155501336L);
            case 1707:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595943155566873L);
            case 1708:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595943155632410L);
            case 1716:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595951745370395L);
            case 1718:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595170061649979L);
            case 1719:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595170061715516L);
            case 1720:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594422737733335L);
            case 1724:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592554427155044L);
            case 1725:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112046309680L);
            case 1727:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112046440753L);
            case 1728:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112046113069L);
            case 1729:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112046178606L);
            case 1730:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112046244143L);
            case 1731:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595981810141477L);
            case 1734:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595981810338086L);
            case 1735:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595981810403623L);
            case 1736:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593301751071829L);
            case 1737:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387650352359L);
            case 1738:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387650286822L);
            case 1739:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595170061781053L);
            case 1740:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595170061846590L);
            case 1741:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979629441832L);
            case 1742:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348998530208L);
            case 1748:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594916658579424L);
            case 1749:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596059119618347L);
            case 1750:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596059119683884L);
            case 1751:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596059119552810L);
            case 1752:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592013260816497L);
            case 1753:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592013260750960L);
            case 1759:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595170061912127L);
            case 1760:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595170061977664L);
            case 1762:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592395514610139L);
            case 1763:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592395514544602L);
            case 1764:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594916658776033L);
            case 1765:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348998661281L);
            case 1767:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081983308017L);
            case 1770:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596080594389304L);
            case 1774:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594916658841570L);
            case 1775:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594126385251920L);
            case 1778:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596110659160380L);
            case 1779:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348998726818L);
            case 1782:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595569493412015L);
            case 1783:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595569493477552L);
            case 1784:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762051465L);
            case 1785:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830761789319L);
            case 1786:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762117002L);
            case 1787:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762182539L);
            case 1788:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830761592710L);
            case 1789:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830761985928L);
            case 1790:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594122089367111L);
            case 1792:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271687808014L);
            case 1793:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271688004623L);
            case 1794:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983927358278L);
            case 1795:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596127839226188L);
            case 1796:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596127839029577L);
            case 1797:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596127839095114L);
            case 1798:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596127839160651L);
            case 1802:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594620305835825L);
            case 1803:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596132133996878L);
            case 1804:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596059119749421L);
            case 1805:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543724722343L);
            case 1808:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596080594454841L);
            case 1811:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596140723931477L);
            case 1813:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175083932001L);
            case 1814:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175083669853L);
            case 1815:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175083735390L);
            case 1816:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175083800927L);
            case 1817:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175083997538L);
            case 1818:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175083866464L);
            case 1819:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596110659225917L);
            case 1823:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595603853150407L);
            case 1824:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983927423815L);
            case 1825:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596226623277432L);
            case 1826:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596230918244729L);
            case 1827:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596183673604461L);
            case 1828:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596183673669998L);
            case 1829:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596183673735535L);
            case 1830:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592034735849611L);
            case 1831:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271688070160L);
            case 1833:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596170788702556L);
            case 1835:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591781332910091L);
            case 1836:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596153608833367L);
            case 1837:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596153608898904L);
            case 1838:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596157903800665L);
            case 1839:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596213738375536L);
            case 1840:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404104282600L);
            case 1841:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592404104217063L);
            case 1846:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594869413742544L);
            case 1847:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596282457852289L);
            case 1851:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596295342754180L);
            case 1857:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596213738441073L);
            case 1858:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596213738506610L);
            case 1859:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596213738572147L);
            case 1860:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596316817590662L);
            case 1861:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596316817656199L);
            case 1863:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596110659291454L);
            case 1864:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271688266771L);
            case 1865:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271688135697L);
            case 1866:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595822896417033L);
            case 1867:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271688201234L);
            case 1868:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595135701780527L);
            case 1871:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596351177329036L);
            case 1872:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596351177394573L);
            case 1873:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596351177460110L);
            case 1874:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596351177525647L);
            case 1875:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596351177591184L);
            case 1876:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596351177656721L);
            case 1877:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595758471907577L);
            case 1882:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081983504626L);
            case 1886:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596445666609591L);
            case 1888:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596424191904179L);
            case 1891:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596428486740404L);
            case 1892:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596441371642293L);
            case 1894:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596441371773366L);
            case 1895:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596376947263919L);
            case 1896:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595810011580676L);
            case 1897:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596376947132845L);
            case 1898:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596376947198382L);
            case 1899:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596376947329456L);
            case 1900:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592683275518619L);
            case 1901:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372652165525L);
            case 1902:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372652231062L);
            case 1903:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372652296599L);
            case 1905:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596213738637684L);
            case 1907:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596475731380732L);
            case 1910:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596505796151828L);
            case 1914:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592541541466714L);
            case 1915:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454256609731L);
            case 1917:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454256740804L);
            case 1918:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454256544194L);
            default:
                return null;
        }
    }

    private Long A0B(int i) {
        switch (i) {
            case 1922:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596548745824791L);
            case 1923:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596548745890328L);
            case 1924:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596548745955865L);
            case 1925:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596548746021402L);
            case 1927:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596561630726692L);
            case 1928:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596557335890466L);
            case 1929:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348999054499L);
            case 1930:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348999120036L);
            case 1931:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387650417896L);
            case 1933:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595028327663617L);
            case 1935:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348999316646L);
            case 1937:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348999251109L);
            case 1938:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596591695694383L);
            case 1939:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596591695497772L);
            case 1940:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596591695563309L);
            case 1941:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596591695628846L);
            case 1942:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596595990465072L);
            case 1946:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596256688310653L);
            case 1947:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596256688048508L);
            case 1948:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596256688507262L);
            case 1955:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596449961773504L);
            case 1958:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594959608580080L);
            case 1960:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596595990727218L);
            case 1961:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596595990596145L);
            case 1962:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777766372036L);
            case 1963:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593383354991838L);
            case 1965:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592992512967500L);
            case 1967:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596651825039935L);
            case 1968:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348999775400L);
            case 1969:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348999840937L);
            case 1971:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593348999644327L);
            case 1972:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594126385317457L);
            case 1973:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596316817721736L);
            case 1974:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443490170157L);
            case 1977:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443490039084L);
            case 1978:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596110659356991L);
            case 1980:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596669004909126L);
            case 1981:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596669004974663L);
            case 1982:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596669005040200L);
            case 1984:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592588786238090L);
            case 1985:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596213738834293L);
            case 1987:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596505796282901L);
            case 1988:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596110659488064L);
            case 1991:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596213738965367L);
            case 1992:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596213738899830L);
            case 1997:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596750609287783L);
            case 2001:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724839942745L);
            case 2002:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724839615061L);
            case 2003:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724839680598L);
            case 2004:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724839746135L);
            case 2005:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724839483987L);
            case 2006:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724839549524L);
            case 2007:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724839811672L);
            case 2009:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596733429418597L);
            case 2010:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596763494189679L);
            case 2011:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592554427351653L);
            case 2012:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596754904386153L);
            case 2013:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596754904320616L);
            case 2014:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596059119880494L);
            case 2015:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596059120011567L);
            case 2016:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596776379091571L);
            case 2017:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777766437573L);
            case 2018:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443491153199L);
            case 2019:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443491218736L);
            case 2021:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443491087662L);
            case 2022:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983927489352L);
            case 2031:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804989364059L);
            case 2032:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451349447167L);
            case 2033:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443491415346L);
            case 2035:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443491349809L);
            case 2037:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039760819103L);
            case 2038:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595139996747828L);
            case 2040:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596853688502928L);
            case 2041:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372652624280L);
            case 2042:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372652689817L);
            case 2043:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349000168618L);
            case 2044:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592554427744870L);
            case 2045:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596836508633734L);
            case 2046:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592382628069834L);
            case 2047:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592382628135371L);
            case C249703kE.FLAG_MOVED:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883753274001L);
            case 2049:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883753339538L);
            case 2050:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372652755354L);
            case 2051:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596802148895357L);
            case 2056:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596797853928060L);
            case 2058:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596896638175919L);
            case 2059:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596892343208621L);
            case 2060:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596849393535626L);
            case 2061:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081983766772L);
            case 2062:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081983832309L);
            case 2063:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081983701235L);
            case 2065:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596905228110513L);
            case 2066:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596905228176050L);
            case 2067:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596905228241587L);
            case 2068:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596905228307124L);
            case 2069:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596905228372661L);
            case 2075:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592734815388324L);
            case 2077:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883753405075L);
            case 2078:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883753470612L);
            case 2079:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883753536149L);
            case 2080:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883753601686L);
            case 2081:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883753667223L);
            case 2082:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883753732760L);
            case 2083:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883753798297L);
            case 2084:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883753863834L);
            case 2085:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883753929371L);
            case 2086:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883753994908L);
            case 2087:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883754060445L);
            case 2088:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883754125982L);
            case 2089:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883754191519L);
            case 2090:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883754257056L);
            case 2091:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883754322593L);
            case 2092:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883754388130L);
            case 2093:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883754453667L);
            case 2094:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883754519204L);
            case 2095:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883754584741L);
            case 2096:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596883754650278L);
            case 2097:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596965357652679L);
            case 2099:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596943882816188L);
            case 2100:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596943883143869L);
            case 2101:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596943883209406L);
            case 2103:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451349578240L);
            case 2106:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594482866947820L);
            case 2113:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597004012358352L);
            case 2119:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081983897846L);
            case 2120:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081983963383L);
            case 2121:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596587400596011L);
            case 2123:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595097047271443L);
            case 2124:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595097047140370L);
            case 2125:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597025487260370L);
            case 2127:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597012602292945L);
            case 2128:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595694047660262L);
            case 2129:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349000299691L);
            case 2132:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596127839488333L);
            case 2134:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443492070707L);
            case 2135:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594959608711153L);
            case 2136:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594959608776690L);
            case 2137:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592863664669409L);
            case 2138:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387650483433L);
            case 2142:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596849393601163L);
            case 2144:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593336111137905L);
            case 2145:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597107091573471L);
            case 2146:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867232911392L);
            case 2147:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596445666740664L);
            case 2148:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596445666806201L);
            case 2149:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596445666871738L);
            case 2150:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596445666937275L);
            case 2151:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596445667002812L);
            case 2152:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596445667068349L);
            case 2153:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596445667133886L);
            case 2154:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596445667199423L);
            case 2158:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597051256998613L);
            case 2159:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597051257064150L);
            case 2160:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597141451311841L);
            case 2161:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724840008282L);
            case 2164:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593336111268978L);
            case 2165:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595569493543089L);
            case 2166:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595354745112701L);
            case 2167:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595354745178238L);
            case 2169:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595148586551350L);
            case 2171:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443492136244L);
            case 2172:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081984159992L);
            case 2174:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597197285886696L);
            case 2177:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597214465755884L);
            case 2178:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592064800686304L);
            case 2179:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595706932955376L);
            case 2181:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271688659990L);
            case 2182:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271688332308L);
            case 2183:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271688397845L);
            case 2186:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039761015712L);
            case 2187:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597266005363472L);
            case 2191:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777766503110L);
            case 2192:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372653279648L);
            default:
                return null;
        }
    }

    private Long A0C(int i) {
        switch (i) {
            case 2193:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372652951963L);
            case 2194:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372653017500L);
            case 2195:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372653083037L);
            case 2196:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372653148574L);
            case 2197:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372653214111L);
            case 2199:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597154336344807L);
            case 2200:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596849393666700L);
            case 2201:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594792104331093L);
            case 2202:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594792104396630L);
            case 2204:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596110659815745L);
            case 2205:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597300365101841L);
            case 2206:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592571606631027L);
            case 2207:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597141451377378L);
            case 2208:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597141451442915L);
            case 2209:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597308955036439L);
            case 2210:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594122089498184L);
            case 2211:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451349709314L);
            case 2212:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451349643777L);
            case 2213:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169334531679L);
            case 2214:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169334597216L);
            case 2215:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169334662753L);
            case 2216:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169334728290L);
            case 2217:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169334793827L);
            case 2218:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169334859364L);
            case 2219:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169334924901L);
            case 2220:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169334990438L);
            case 2221:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335055975L);
            case 2222:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335121512L);
            case 2223:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335187049L);
            case 2224:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335252586L);
            case 2225:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335318123L);
            case 2226:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335383660L);
            case 2227:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335449197L);
            case 2228:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335514734L);
            case 2229:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335580271L);
            case 2230:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335645808L);
            case 2231:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335711345L);
            case 2232:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335776882L);
            case 2233:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335842419L);
            case 2234:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335907956L);
            case 2235:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169335973493L);
            case 2236:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169336039030L);
            case 2237:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169336104567L);
            case 2238:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169336170104L);
            case 2239:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169336235641L);
            case 2240:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169336301178L);
            case 2241:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169336366715L);
            case 2242:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169334335068L);
            case 2243:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169334400605L);
            case 2244:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594169334466142L);
            case 2245:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597326134905625L);
            case 2247:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454256871877L);
            case 2248:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596832213731973L);
            case 2251:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592683275584156L);
            case 2254:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372653345185L);
            case 2255:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257416018684L);
            case 2257:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257415822074L);
            case 2258:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257415428854L);
            case 2259:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257415953147L);
            case 2260:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257415494391L);
            case 2262:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597394854382374L);
            case 2263:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501501250046L);
            case 2264:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501501315583L);
            case 2265:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501501381120L);
            case 2266:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501501446657L);
            case 2271:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501501708804L);
            case 2272:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501501643267L);
            case 2273:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501501512194L);
            case 2274:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595625328117966L);
            case 2275:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593336111531125L);
            case 2276:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372653476258L);
            case 2280:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597472163793723L);
            case 2281:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597472163924796L);
            case 2282:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349000430764L);
            case 2283:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349000496301L);
            case 2284:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597485048695634L);
            case 2285:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593537974011253L);
            case 2286:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597497933597524L);
            case 2287:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593804261852666L);
            case 2288:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595135701846064L);
            case 2290:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597519408434005L);
            case 2291:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597519408499542L);
            case 2296:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592455642186290L);
            case 2297:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592455642251827L);
            case 2298:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081984291065L);
            case 2299:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594792104462167L);
            case 2300:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597540883270487L);
            case 2301:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724840139355L);
            case 2303:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593039761081249L);
            case 2304:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596110660274498L);
            case 2305:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724840204892L);
            case 2306:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593903046428185L);
            case 2307:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593903046493722L);
            case 2308:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593903046559259L);
            case 2309:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595041212434442L);
            case 2310:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596110660340035L);
            case 2311:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257416149757L);
            case 2312:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257416215294L);
            case 2313:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257416280831L);
            case 2314:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257416346368L);
            case 2315:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257416411905L);
            case 2316:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257416477442L);
            case 2317:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257416542979L);
            case 2318:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257416608516L);
            case 2319:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387650548970L);
            case 2320:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979629507369L);
            case 2324:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271688856599L);
            case 2326:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271688922136L);
            case 2327:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501501839877L);
            case 2328:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349000627375L);
            case 2329:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349000561838L);
            case 2330:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597609602747237L);
            case 2332:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762313613L);
            case 2333:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762379150L);
            case 2334:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762444687L);
            case 2335:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762510224L);
            case 2336:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762575761L);
            case 2337:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762641298L);
            case 2338:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762706835L);
            case 2339:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762772372L);
            case 2340:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762837909L);
            case 2341:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762903446L);
            case 2342:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830762248076L);
            case 2343:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596110660405572L);
            case 2344:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597592423009117L);
            case 2345:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597592423074654L);
            case 2346:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597141451508452L);
            case 2347:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597141451573989L);
            case 2348:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597141451639526L);
            case 2350:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597738451766168L);
            case 2351:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597738452028315L);
            case 2352:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597738451897241L);
            case 2353:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597738451962778L);
            case 2354:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867232976929L);
            case 2355:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867233042466L);
            case 2356:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867233108003L);
            case 2357:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451349774851L);
            case 2358:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349000758448L);
            case 2359:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349000823985L);
            case 2360:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349000889522L);
            case 2361:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349000955059L);
            case 2362:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636758652316L);
            case 2363:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594671845246777L);
            case 2365:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597768516537308L);
            case 2366:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597472163990333L);
            case 2369:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595569493608626L);
            case 2370:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591867233173540L);
            case 2371:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593589513946500L);
            case 2373:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759926668194L);
            case 2374:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759926602657L);
            case 2375:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349001151670L);
            case 2376:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349001020596L);
            case 2377:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349001086133L);
            case 2378:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349001217207L);
            case 2379:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724840335966L);
            case 2380:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596724840270429L);
            case 2381:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454257068486L);
            case 2382:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592971039114001L);
            case 2383:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597815761243104L);
            case 2384:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236210671L);
            case 2385:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236276208L);
            case 2386:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236341745L);
            case 2387:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236407282L);
            case 2388:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236472819L);
            case 2389:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236538356L);
            case 2390:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236603893L);
            case 2391:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236669430L);
            case 2392:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236014060L);
            case 2393:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236079597L);
            case 2394:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236145134L);
            case 2395:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454257134023L);
            case 2398:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597472164252481L);
            case 2399:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597472164055870L);
            case 2400:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597472164121407L);
            case 2401:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597472164186944L);
            case 2402:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229464532639L);
            case 2403:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229464008345L);
            case 2404:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229464598176L);
            case 2405:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229464139418L);
            case 2406:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229464663713L);
            case 2407:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229464336028L);
            case 2408:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229463615126L);
            case 2409:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229464270491L);
            case 2410:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229464401565L);
            case 2411:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229463746199L);
            case 2412:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229464467102L);
            case 2413:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229463877272L);
            case 2414:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229464729250L);
            case 2415:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229464794787L);
            case 2416:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594229464860324L);
            case 2417:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597704092027770L);
            case 2420:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597880185687085L);
            case 2421:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593074117477291L);
            case 2422:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759926799267L);
            case 2423:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595127112108066L);
            case 2424:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595127112173603L);
            case 2425:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595127112239140L);
            case 2427:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595195831191623L);
            case 2428:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271689053209L);
            case 2429:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596849393797774L);
            case 2430:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596849393863311L);
            case 2431:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596849393732237L);
            case 2434:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597940315229250L);
            case 2435:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595195831257160L);
            case 2440:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257415559928L);
            case 2441:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257415625465L);
            case 2442:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597918840392764L);
            case 2443:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597918840458301L);
            case 2445:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598030509935694L);
            case 2446:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598030509870157L);
            case 2447:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236931578L);
            case 2448:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236734967L);
            case 2449:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236800504L);
            case 2450:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236866041L);
            case 2451:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794945389270L);
            case 2453:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594959608842227L);
            case 2454:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595354745243775L);
            case 2455:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598077754182749L);
            case 2456:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598064869280852L);
            case 2457:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794945454807L);
            case 2458:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597738452552604L);
            case 2459:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597738452618141L);
            case 2461:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598064869346389L);
            case 2462:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927061414L);
            case 2463:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759926864804L);
            case 2464:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759926930341L);
            case 2466:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454257265096L);
            case 2467:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214159554L);
            default:
                return null;
        }
    }

    private Long A0D(int i) {
        switch (i) {
            case 2469:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594422737929944L);
            case 2470:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595852961188110L);
            case 2472:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597592423271263L);
            case 2473:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081984356602L);
            case 2475:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598116408888422L);
            case 2477:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594508636751600L);
            case 2488:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387650614507L);
            case 2489:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271689118746L);
            case 2492:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804989495132L);
            case 2494:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501502298633L);
            case 2495:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501502036486L);
            case 2496:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501502102023L);
            case 2497:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501502167560L);
            case 2498:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596110660667717L);
            case 2499:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598159358561396L);
            case 2500:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598180833397891L);
            case 2501:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598180833528964L);
            case 2502:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592455642317364L);
            case 2503:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454257723849L);
            case 2504:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454257789386L);
            case 2506:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593443492529461L);
            case 2507:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214094017L);
            case 2508:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592086280110352L);
            case 2509:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804989560669L);
            case 2510:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804989626206L);
            case 2517:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837237062652L);
            case 2518:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837236997115L);
            case 2519:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979629638442L);
            case 2520:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979629703979L);
            case 2522:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349001413816L);
            case 2528:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595195831453769L);
            case 2529:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595195831519306L);
            case 2530:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595127112370213L);
            case 2532:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592863664800482L);
            case 2533:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593499319829843L);
            case 2535:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598331157318842L);
            case 2536:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598331157253305L);
            case 2537:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598331157384379L);
            case 2538:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595728407202036L);
            case 2540:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598313977384105L);
            case 2541:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979629769516L);
            case 2543:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593336111334515L);
            case 2544:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593336111400052L);
            case 2546:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501502495242L);
            case 2547:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372653607331L);
            case 2549:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597326135036698L);
            case 2552:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372653672868L);
            case 2557:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595195831650379L);
            case 2558:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595195831715916L);
            case 2559:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257416805125L);
            case 2560:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598331157449916L);
            case 2561:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288207711370L);
            case 2562:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593499319895380L);
            case 2563:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598421351566540L);
            case 2569:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598404171697350L);
            case 2571:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112047030578L);
            case 2574:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804989691743L);
            case 2575:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804989757280L);
            case 2577:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501502560779L);
            case 2579:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593301751530582L);
            case 2580:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595706933283057L);
            case 2581:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598442826534101L);
            case 2583:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598442826468564L);
            case 2588:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927126951L);
            case 2592:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592185061146975L);
            case 2594:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596449962887617L);
            case 2595:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596943883274943L);
            case 2596:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596943883340480L);
            case 2597:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598515840847064L);
            case 2598:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598408466664647L);
            case 2601:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501502757390L);
            case 2602:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501502626316L);
            case 2603:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501502691853L);
            case 2604:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598554495552737L);
            case 2605:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501502822927L);
            case 2606:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598537315683548L);
            case 2607:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598537315749085L);
            case 2608:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175084063075L);
            case 2609:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175084128612L);
            case 2610:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349001610425L);
            case 2614:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593499320550741L);
            case 2615:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288207776907L);
            case 2616:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288207842444L);
            case 2617:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598593150258409L);
            case 2618:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598064869411926L);
            case 2619:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598064869477463L);
            case 2623:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598348337253567L);
            case 2624:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598348337319104L);
            case 2625:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598348337122494L);
            case 2627:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837237324797L);
            case 2628:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837237390334L);
            case 2629:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837237455871L);
            case 2632:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595625328183503L);
            case 2633:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598571675421928L);
            case 2634:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598567380454629L);
            case 2635:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598567380520166L);
            case 2637:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927192488L);
            case 2638:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927258025L);
            case 2639:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927323562L);
            case 2645:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596905228438198L);
            case 2646:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349001675962L);
            case 2650:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598356927057089L);
            case 2651:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598356927122626L);
            case 2653:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592983927554889L);
            case 2654:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598618920062189L);
            case 2655:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349001741499L);
            case 2656:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592116340490562L);
            case 2658:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596351177722258L);
            case 2659:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596351177787795L);
            case 2660:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596351177853332L);
            case 2662:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387650811116L);
            case 2663:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387650876653L);
            case 2664:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387651007727L);
            case 2665:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593387650942190L);
            case 2666:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452076107077L);
            case 2667:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593452076172614L);
            case 2668:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598378401893573L);
            case 2669:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598623215095022L);
            case 2670:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598537315814622L);
            case 2672:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598563085487330L);
            case 2674:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454258444748L);
            case 2675:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454257985995L);
            case 2676:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454258510285L);
            case 2677:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598666164702455L);
            case 2678:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349001872573L);
            case 2679:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349001807036L);
            case 2680:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598661869735158L);
            case 2681:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112047161651L);
            case 2682:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777766765255L);
            case 2683:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636758783390L);
            case 2684:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636758848927L);
            case 2687:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636759176609L);
            case 2689:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636759045536L);
            case 2690:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636758717853L);
            case 2691:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598713409342728L);
            case 2695:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593258801595385L);
            case 2697:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597472164514626L);
            case 2698:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592081985011963L);
            case 2699:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598726294244617L);
            case 2700:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598726294310154L);
            case 2701:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594268119631528L);
            case 2702:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598786423852315L);
            case 2703:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594804989822817L);
            case 2705:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598782128819482L);
            case 2706:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598790719016224L);
            case 2707:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598790719081761L);
            case 2708:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598790719147298L);
            case 2709:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598790718754076L);
            case 2710:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598790718819613L);
            case 2711:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598790718885150L);
            case 2712:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598790718950687L);
            case 2713:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597472164580163L);
            case 2714:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597472164645700L);
            case 2717:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372653738405L);
            case 2718:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598812193590564L);
            case 2719:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454258706894L);
            case 2724:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596943883406017L);
            case 2725:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596943883471554L);
            case 2726:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596943883537091L);
            case 2727:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596943883602628L);
            case 2728:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596943883668165L);
            case 2729:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451350168068L);
            case 2731:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636759831973L);
            case 2732:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636759635363L);
            case 2733:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636759438754L);
            case 2734:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636759700900L);
            case 2735:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598842258361642L);
            case 2736:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595857256220945L);
            case 2739:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043326832800L);
            case 2740:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592043326767263L);
            case 2741:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927454635L);
            default:
                return null;
        }
    }

    private Long A0E(int i) {
        switch (i) {
            case 2742:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598876618100020L);
            case 2746:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592794945520344L);
            case 2747:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594422737995481L);
            case 2748:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593804261983739L);
            case 2749:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595852961253647L);
            case 2752:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837237718016L);
            case 2755:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271689249820L);
            case 2756:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257416936198L);
            case 2757:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257417001735L);
            case 2758:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288207973517L);
            case 2763:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837237783553L);
            case 2766:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599009762086235L);
            case 2768:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599082776530310L);
            case 2769:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257417067272L);
            case 2770:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372653935014L);
            case 2771:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451350233605L);
            case 2772:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599112841301432L);
            case 2773:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596110660798790L);
            case 2774:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596110660864327L);
            case 2775:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636760028584L);
            case 2777:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636759963047L);
            case 2778:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636759897510L);
            case 2779:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594422738126554L);
            case 2781:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599164381433286L);
            case 2782:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599164381105601L);
            case 2783:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599164381171138L);
            case 2784:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599164381302212L);
            case 2785:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599164381367749L);
            case 2786:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599164380908992L);
            case 2787:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599164381236675L);
            case 2789:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598313977449642L);
            case 2790:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599091366464919L);
            case 2792:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636760094121L);
            case 2793:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979629900589L);
            case 2794:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592979629966126L);
            case 2795:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451350299142L);
            case 2796:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599181560843721L);
            case 2800:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595371925047427L);
            case 2801:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595371925112964L);
            case 2802:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595371925178501L);
            case 2803:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837237849090L);
            case 2804:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837237914627L);
            case 2805:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837237980164L);
            case 2806:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598567380651239L);
            case 2807:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927782320L);
            case 2808:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927847857L);
            case 2809:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927520172L);
            case 2810:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927585709L);
            case 2811:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927651246L);
            case 2812:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927913394L);
            case 2813:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927716783L);
            case 2816:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636760159658L);
            case 2817:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636760225195L);
            case 2818:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636760290732L);
            case 2819:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830763100055L);
            case 2820:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830763165592L);
            case 2822:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596557336021539L);
            case 2823:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271689184283L);
            case 2824:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593207261987823L);
            case 2826:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599233100385744L);
            case 2827:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593847211722245L);
            case 2828:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593894456231440L);
            case 2832:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454258772431L);
            case 2834:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598537315880159L);
            case 2836:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599417783979525L);
            case 2837:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594452802569956L);
            case 2838:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830763558809L);
            case 2839:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454258903504L);
            case 2840:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454258969041L);
            case 2841:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596256688900479L);
            case 2842:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837238045701L);
            case 2843:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593610989438353L);
            case 2844:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314704895463L);
            case 2845:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314704764389L);
            case 2846:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314704829926L);
            case 2848:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599443553783310L);
            case 2849:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599443553848847L);
            case 2850:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599443553914384L);
            case 2851:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599443553979921L);
            case 2852:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599443554110995L);
            case 2853:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599443554045458L);
            case 2854:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599452143717910L);
            case 2858:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482208488996L);
            case 2859:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482208554533L);
            case 2860:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482208620070L);
            case 2861:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482208685607L);
            case 2862:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482208751144L);
            case 2863:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482208816681L);
            case 2865:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482208947754L);
            case 2866:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209013291L);
            case 2867:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209078828L);
            case 2868:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209144365L);
            case 2869:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209209902L);
            case 2870:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209275439L);
            case 2871:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209340976L);
            case 2872:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209406513L);
            case 2875:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598228078103685L);
            case 2876:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598228078169222L);
            case 2877:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598228078234759L);
            case 2879:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495093456442L);
            case 2880:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495093718589L);
            case 2881:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543725115562L);
            case 2882:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596501502888464L);
            case 2883:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543724984488L);
            case 2884:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595543725050025L);
            case 2889:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599361949404668L);
            case 2890:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599361949470205L);
            case 2891:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599361949535742L);
            case 2892:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599361949601279L);
            case 2893:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599361949666816L);
            case 2894:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599361949732353L);
            case 2897:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599598172737109L);
            case 2898:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599598172802646L);
            case 2899:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599598172868183L);
            case 2900:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599598172933720L);
            case 2902:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599598173064793L);
            case 2903:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599598173130330L);
            case 2905:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599628237377123L);
            case 2907:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599649712213606L);
            case 2908:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636760356269L);
            case 2911:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599520863194698L);
            case 2912:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599520863260235L);
            case 2914:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830763689882L);
            case 2915:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830763886492L);
            case 2916:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830764083102L);
            case 2917:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599632532344420L);
            case 2918:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765393828L);
            case 2919:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765459365L);
            case 2920:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765524902L);
            case 2921:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765590439L);
            case 2922:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765655976L);
            case 2923:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765721513L);
            case 2924:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765131680L);
            case 2925:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830759692141L);
            case 2926:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830759757678L);
            case 2927:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765197217L);
            case 2928:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765262754L);
            case 2929:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765328291L);
            case 2931:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495093587516L);
            case 2932:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495093784126L);
            case 2934:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495094046271L);
            case 2935:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495093521979L);
            case 2936:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636760421806L);
            case 2937:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636760487343L);
            case 2938:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592734815519397L);
            case 2941:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765787050L);
            case 2942:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596754904517226L);
            case 2944:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636760618416L);
            case 2945:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592777766896328L);
            case 2946:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599417784110599L);
            case 2947:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599417784045062L);
            case 2948:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759927978931L);
            case 2949:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288208039054L);
            case 2950:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087071628679L);
            case 2951:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087071694216L);
            case 2952:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087071825289L);
            case 2953:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759928044468L);
            case 2954:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766442420L);
            case 2955:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766507957L);
            case 2956:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765852587L);
            case 2957:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766049198L);
            case 2958:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766114735L);
            case 2959:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766180272L);
            case 2960:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765983661L);
            case 2961:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766245809L);
            case 2962:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766311346L);
            case 2963:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766376883L);
            case 2964:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830765918124L);
            case 2965:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591927361404989L);
            case 2966:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209472050L);
            case 2967:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599774266265203L);
            case 2968:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599774266330740L);
            case 2969:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595127112632358L);
            case 2970:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451350561290L);
            case 2971:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451350692364L);
            case 2972:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451350626827L);
            case 2973:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766639030L);
            case 2974:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599885935414924L);
            case 2975:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599885935480461L);
            case 2976:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599885935545998L);
            case 2977:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599885935611535L);
            case 2978:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599885935677072L);
            case 2979:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599885935742609L);
            case 2980:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599885935808146L);
            case 2981:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597257417198345L);
            case 2982:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599907410251413L);
            case 2984:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451350364679L);
            case 2985:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599688366919275L);
            case 2986:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349002527936L);
            case 2987:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349002462399L);
            case 2988:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594916659103716L);
            case 2989:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594916659038179L);
            case 2990:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349002593473L);
            case 2991:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349002659010L);
            case 2995:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759928372149L);
            case 2996:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759928765367L);
            case 2998:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759928568758L);
            case 2999:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599907410316950L);
            case 3000:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600001899597480L);
            case 3001:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600001899531943L);
            case 3002:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175084194149L);
            case 3003:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175084325223L);
            case 3004:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175084456296L);
            case 3005:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599851575676541L);
            case 3006:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599739906526833L);
            case 3007:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288208104591L);
            case 3008:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288208170128L);
            case 3009:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288208235665L);
            case 3010:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288208301202L);
            case 3011:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314704961000L);
            case 3012:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599855870643839L);
            case 3013:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599937475022488L);
            case 3015:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593336111793270L);
            default:
                return null;
        }
    }

    private Long A0F(int i) {
        switch (i) {
            case 3016:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087798877900L);
            case 3017:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087798943437L);
            case 3018:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799008974L);
            case 3019:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799074511L);
            case 3020:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799140048L);
            case 3021:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799205585L);
            case 3022:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799271122L);
            case 3023:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799336659L);
            case 3024:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600087799402196L);
            case 3025:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349002724547L);
            case 3026:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599976129793693L);
            case 3027:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599976129859230L);
            case 3028:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599976129728156L);
            case 3029:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599933180055191L);
            case 3030:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495094439493L);
            case 3031:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495094111808L);
            case 3032:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495094177345L);
            case 3033:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495094242882L);
            case 3034:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495094308419L);
            case 3035:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495094373956L);
            case 3036:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175084521833L);
            case 3037:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271689315357L);
            case 3038:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271689380894L);
            case 3039:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349002396862L);
            case 3040:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451350430216L);
            case 3041:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451350495753L);
            case 3047:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596175084587370L);
            case 3048:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837238242312L);
            case 3049:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837238111238L);
            case 3050:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837238176775L);
            case 3052:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593903046821404L);
            case 3053:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991786242138L);
            case 3063:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079210516159L);
            case 3064:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079209008822L);
            case 3065:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079210450622L);
            case 3066:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079209074359L);
            case 3067:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079209139896L);
            case 3068:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079209205433L);
            case 3069:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079209270970L);
            case 3070:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079209336507L);
            case 3071:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079209402044L);
            case 3074:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079209598653L);
            case 3078:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636760683953L);
            case 3079:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759928961977L);
            case 3080:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759928896440L);
            case 3082:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600062029270707L);
            case 3083:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600062029336244L);
            case 3084:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600062029401781L);
            case 3085:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599087071890826L);
            case 3086:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600062029074096L);
            case 3087:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600062029139633L);
            case 3088:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600062029205170L);
            case 3089:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599654007180903L);
            case 3090:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600126453583586L);
            case 3091:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271689643041L);
            case 3092:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271689511967L);
            case 3093:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271689577504L);
            case 3094:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592056214225091L);
            case 3096:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598159358692469L);
            case 3097:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600147928420075L);
            case 3098:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648027898L);
            case 3099:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648093435L);
            case 3100:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648158972L);
            case 3101:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648224509L);
            case 3102:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648290046L);
            case 3103:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648355583L);
            case 3104:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648421120L);
            case 3105:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648486657L);
            case 3106:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648552194L);
            case 3107:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648617731L);
            case 3108:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648683268L);
            case 3109:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648748805L);
            case 3110:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648814342L);
            case 3111:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648879879L);
            case 3112:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216648945416L);
            case 3113:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216649010953L);
            case 3114:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216649076490L);
            case 3115:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216649142027L);
            case 3116:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216649207564L);
            case 3117:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216649273101L);
            case 3118:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216649338638L);
            case 3119:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216649404175L);
            case 3120:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216649469712L);
            case 3121:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216649535249L);
            case 3122:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216649600786L);
            case 3124:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216649731859L);
            case 3125:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216649797396L);
            case 3127:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216649928469L);
            case 3129:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216647896824L);
            case 3130:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216647962361L);
            case 3131:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636760749490L);
            case 3133:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600263892537143L);
            case 3135:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454259231186L);
            case 3136:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271689708578L);
            case 3137:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596256688966016L);
            case 3138:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596548746086939L);
            case 3139:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766835641L);
            case 3140:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766704567L);
            case 3141:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766770104L);
            case 3142:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766901178L);
            case 3143:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598408466730184L);
            case 3144:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598408466795721L);
            case 3146:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600263892668217L);
            case 3147:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600263892602680L);
            case 3149:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595625328249040L);
            case 3150:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595625328314577L);
            case 3151:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595625328380114L);
            case 3153:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271689839651L);
            case 3154:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271689970724L);
            case 3160:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079210581696L);
            case 3161:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079210647233L);
            case 3163:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636760880563L);
            case 3164:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599834395872891L);
            case 3165:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837238307849L);
            case 3169:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36595638213216475L);
            case 3170:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349002790084L);
            case 3171:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349002855621L);
            case 3172:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991786373211L);
            case 3173:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636761011637L);
            case 3174:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636760946100L);
            case 3175:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600371266719607L);
            case 3176:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600371266785144L);
            case 3177:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600147928485612L);
            case 3178:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271690232870L);
            case 3179:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271690298407L);
            case 3180:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271690560554L);
            case 3181:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271690429480L);
            case 3182:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271690495017L);
            case 3183:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593271690167333L);
            case 3184:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600263892799290L);
            case 3186:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600083504041675L);
            case 3187:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600057734106799L);
            case 3188:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991786438748L);
            case 3189:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596372654000551L);
            case 3190:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593301751858263L);
            case 3191:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36591991786504285L);
            case 3192:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759929093050L);
            case 3193:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592674686042773L);
            case 3194:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599482209537587L);
            case 3195:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598408466861258L);
            case 3196:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598408466926795L);
            case 3197:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837238438922L);
            case 3198:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597837238569995L);
            case 3199:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830766966715L);
            case 3200:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598331157515453L);
            case 3201:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349002921158L);
            case 3202:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349002986695L);
            case 3203:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349003052232L);
            case 3204:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349003117769L);
            case 3205:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349003183306L);
            case 3206:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349003248843L);
            case 3210:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314705354218L);
            case 3211:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314705419755L);
            case 3212:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599314705026537L);
            case 3213:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600409921425274L);
            case 3214:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593499320616278L);
            case 3218:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600147928551149L);
            case 3219:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600147928616686L);
            case 3220:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288208432275L);
            case 3221:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451350888973L);
            case 3222:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349003576525L);
            case 3223:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349003510988L);
            case 3224:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495094505030L);
            case 3225:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495094570567L);
            case 3226:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495094636104L);
            case 3227:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830767032252L);
            case 3228:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830763755419L);
            case 3229:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830763952029L);
            case 3230:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830767097789L);
            case 3231:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594830764148639L);
            case 3233:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759929289661L);
            case 3234:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759929224124L);
            case 3235:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599495094701641L);
            case 3236:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288208497812L);
            case 3237:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288208563349L);
            case 3238:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079210843842L);
            case 3239:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600079210909379L);
            case 3240:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600538770509720L);
            case 3241:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593349003642062L);
            case 3242:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759929158587L);
            case 3243:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600560245280669L);
            case 3244:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759929486270L);
            case 3245:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36597759929551807L);
            case 3246:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600251007635254L);
            case 3249:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636761208246L);
            case 3252:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592112047227188L);
            case 3253:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288208694422L);
            case 3254:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288208759959L);
            case 3256:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351151120L);
            case 3257:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351216657L);
            case 3258:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351020046L);
            case 3259:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36592451351085583L);
            case 3260:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36593636761339319L);
            case 3262:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600646144626624L);
            case 3263:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600646144823233L);
            case 3264:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36594916659169253L);
            case 3266:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600263893061436L);
            case 3267:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600263892995899L);
            case 3268:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599417784176136L);
            case 3269:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599417784241673L);
            case 3270:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680504364997L);
            case 3271:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680504430534L);
            case 3272:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680504496071L);
            case 3273:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680504561608L);
            case 3274:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680504627145L);
            case 3275:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600680504692682L);
            case 3276:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216650125078L);
            case 3277:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36600216650190615L);
            case 3278:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36599443554176532L);
            case 3279:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454259362260L);
            case 3280:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454259427797L);
            case 3281:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454259493334L);
            case 3282:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454259558871L);
            case 3283:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454259624408L);
            case 3284:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454259689945L);
            case 3285:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454259755482L);
            case 3286:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454259821019L);
            case 3287:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454259886556L);
            case 3288:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36596454259952093L);
            case 3289:
                return AnonymousClass7TF.A0Y(0Tu.A05, this.A00, 36598288208825496L);
            default:
                return null;
        }
    }

    private Long A0G(int i) {
        switch (i) {
            case 274:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592481411793468L);
            case 277:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592850778981088L);
            case 283:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592120634540355L);
            case 284:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043325587604L);
            case 285:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043325784214L);
            case 286:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043325194382L);
            case 287:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592382627545542L);
            case 288:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592382627676616L);
            case 289:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592382627611079L);
            case 294:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451347087865L);
            case 295:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983926309696L);
            case 296:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591966015717449L);
            case 302:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592421282316781L);
            case 307:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056212390069L);
            case 308:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592039030161548L);
            case 309:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593052642444197L);
            case 316:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592683275256471L);
            case 317:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592683275387545L);
            case 318:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592683275322008L);
            case 319:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592683275453082L);
            case 320:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592988217934666L);
            case 321:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592988218000203L);
            case 334:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592395513364947L);
            case 341:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056211603627L);
            case 342:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983926178622L);
            case 343:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983925588791L);
            case 344:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983924933424L);
            case 345:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983925654328L);
            case 346:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983926113085L);
            case 347:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983926375233L);
            case 348:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983926047548L);
            case 349:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983925392181L);
            case 350:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983926440770L);
            case 351:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983926506307L);
            case 352:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983925130035L);
            case 353:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983924998961L);
            case 354:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983925261108L);
            case 355:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983925982011L);
            case 356:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983925719865L);
            case 357:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983925785402L);
            case 358:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983925064498L);
            case 359:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983925523254L);
            case 373:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592185059901788L);
            case 382:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592013260357742L);
            case 385:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592928088392442L);
            case 390:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592386922774990L);
            case 393:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592185059246424L);
            case 398:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056212258995L);
            case 399:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056211538090L);
            case 401:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056212062385L);
            case 402:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983926244159L);
            case 403:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592395513561558L);
            case 404:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592395513168336L);
            case 405:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592395513430484L);
            case 406:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592395513496021L);
            case 407:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592395513233873L);
            case 408:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592395513102799L);
            case 420:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592975333229332L);
            case 421:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592975333425943L);
            case 425:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592185059311961L);
            case 426:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404103365088L);
            case 430:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404103168477L);
            case 434:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592571606172273L);
            case 435:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592588785975942L);
            case 436:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592588786041479L);
            case 437:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591978900684877L);
            case 438:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081980096739L);
            case 439:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592571606106736L);
            case 440:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592571606237810L);
            case 444:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867231469590L);
            case 446:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991785521236L);
            case 453:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592743404798631L);
            case 456:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592000375455848L);
            case 457:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592185059115351L);
            case 458:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979628000029L);
            case 465:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592593080943243L);
            case 466:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592073390031073L);
            case 467:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592528656433752L);
            case 470:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592064799965398L);
            case 474:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404103299551L);
            case 475:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591978900619340L);
            case 478:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404103234014L);
            case 479:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592700455191197L);
            case 480:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777764733620L);
            case 481:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056211800238L);
            case 484:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592189354017120L);
            case 486:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592842189046494L);
            case 494:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056212652215L);
            case 497:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592137814409548L);
            case 498:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404103692769L);
            case CameraCapturer.OPEN_CAMERA_DELAY_MS:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592481411924541L);
            case 501:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592820714275549L);
            case 502:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592820714210012L);
            case 503:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593082707215279L);
            case 504:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056212324532L);
            case 509:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592597375976077L);
            case 510:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592597375910540L);
            case 511:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081980162276L);
            case 515:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592408397414892L);
            case 516:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404103758306L);
            case 517:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592481411990078L);
            case 518:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591927361011771L);
            case 519:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592116339573048L);
            case 520:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592116339638585L);
            case 521:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592116339704122L);
            case 523:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081980293349L);
            case 526:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592588786107016L);
            case 527:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592129224606022L);
            case 528:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592129224474948L);
            case 529:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592129224540485L);
            case 531:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592455641989680L);
            case 532:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087002182576L);
            case 533:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087002248113L);
            case 534:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087002313650L);
            case 535:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087002379187L);
            case 541:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979628065566L);
            case 542:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592013260423279L);
            default:
                return null;
        }
    }

    private Long A0H(int i) {
        switch (i) {
            case 551:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081980358886L);
            case 558:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591983195652176L);
            case 559:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592137814475085L);
            case 560:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592567311401581L);
            case 561:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794944406220L);
            case 563:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794944471757L);
            case 564:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591983195717713L);
            case 565:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591996080554086L);
            case 568:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081980686567L);
            case 570:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087002706872L);
            case 571:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087002772409L);
            case 572:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087002575798L);
            case 573:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087002444724L);
            case 574:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087002641335L);
            case 575:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592842189112031L);
            case 576:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794944602831L);
            case 577:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794944537294L);
            case 578:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592511476564567L);
            case 579:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591987490553939L);
            case 581:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043325980825L);
            case 582:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043326046362L);
            case 585:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592618850878096L);
            case 588:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592210828853609L);
            case 590:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081980948712L);
            case 591:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777764864693L);
            case 593:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794944668368L);
            case 594:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087002510261L);
            case 595:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087002837946L);
            case 596:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591781332123651L);
            case 597:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591781332189188L);
            case 599:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593091297280963L);
            case 600:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593095592117188L);
            case 602:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593104182051781L);
            case 604:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081981079785L);
            case 606:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593117066953671L);
            case 607:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592064800030935L);
            case 609:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592588786172553L);
            case 611:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777765192378L);
            case 612:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777764930230L);
            case 613:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777764995767L);
            case 614:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777765061304L);
            case 615:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777765126841L);
            case 616:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592034735587464L);
            case 617:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056212783289L);
            case 618:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056212717752L);
            case 621:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592064800096472L);
            case 624:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593164311593954L);
            case 627:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591983195848786L);
            case 628:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593207261266921L);
            case 629:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593207261332458L);
            case 630:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593207261397995L);
            case 631:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081981276394L);
            case 632:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592455642055217L);
            case 633:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777765323451L);
            case 637:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777765454525L);
            case 638:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777765388988L);
            case 641:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777765520062L);
            case 642:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777765585599L);
            case 643:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777765651136L);
            case 644:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777765716673L);
            case 645:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271685776380L);
            case 646:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271685841917L);
            case 648:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593258800874488L);
            case 650:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593275980743755L);
            case 651:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593280275711052L);
            case 652:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087002903483L);
            case 653:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593267390809083L);
            case 654:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593293160612942L);
            case 655:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593297455580239L);
            case 656:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593301750547536L);
            case 661:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592210828919146L);
            case 670:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039758787481L);
            case 674:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593323225384034L);
            case 675:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593323225449571L);
            case 678:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593331815318629L);
            case 679:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593331815384166L);
            case 680:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593331815449703L);
            case 681:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593331815515240L);
            case 682:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043326111899L);
            case 684:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593336110285930L);
            case 685:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593336110351467L);
            case 686:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593336110417004L);
            case 687:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593336110482541L);
            case 688:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593340405253239L);
            case 693:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348995253370L);
            case 695:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348995384443L);
            case 696:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348995449980L);
            case 697:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348995515517L);
            case 698:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348995581054L);
            case 699:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348995646591L);
            case 701:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348995777664L);
            case 702:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348995843201L);
            case 703:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348995908738L);
            case 704:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348995974275L);
            case 705:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996039812L);
            case 706:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996105349L);
            case 707:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996170886L);
            case 708:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996236423L);
            case 709:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996301960L);
            case 710:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996367497L);
            case 711:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996433034L);
            case 712:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996498571L);
            case 714:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593190081397731L);
            case 715:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593301750678609L);
            case 716:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593383354926301L);
            case 717:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387649959137L);
            case 718:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387649893600L);
            case 720:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593409124795647L);
            case 725:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996629644L);
            case 726:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996695181L);
            case 742:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081981538539L);
            case 744:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592185060426078L);
            case 745:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593439189501184L);
            case 746:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452074599738L);
            case 747:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452074665275L);
            case 748:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452074730812L);
            case 749:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452074796349L);
            case 750:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452074861886L);
            case 751:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452074927423L);
            case 752:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452074992960L);
            case 753:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452075058497L);
            case 754:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452075124034L);
            case 755:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452074403127L);
            case 756:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452074468664L);
            case 757:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452074534201L);
            case 758:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593250211070966L);
            case 759:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592902318719728L);
            case 760:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593301750744146L);
            case 761:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271685907454L);
            case 762:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996760718L);
            case 763:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996826255L);
            case 764:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996891792L);
            case 765:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520793879899L);
            case 766:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593529383880049L);
            case 767:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593537973749106L);
            case 768:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593537973814643L);
            case 769:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593537973880180L);
            case 770:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593499319108942L);
            case 772:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593301750875219L);
            case 773:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039759246234L);
            case 774:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348997022866L);
            case 775:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348996957329L);
            case 778:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593250211136503L);
            case 779:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443485189386L);
            case 780:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443485058312L);
            case 781:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443485254923L);
            case 782:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443485320460L);
            case 783:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443485385997L);
            case 784:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443484468481L);
            case 785:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443484534018L);
            case 786:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443484599555L);
            case 787:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443484665092L);
            case 788:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443484730629L);
            case 789:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443484796166L);
            case 790:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443484861703L);
            case 791:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443485123849L);
            case 792:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592545836696159L);
            case 793:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979628131103L);
            case 794:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979628196640L);
            case 795:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979628262177L);
            case 796:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979628327714L);
            case 797:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593499319174479L);
            case 799:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593555153683830L);
            case 801:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271686300674L);
            case 802:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271686366211L);
            case 803:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271686169601L);
            case 804:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271685972991L);
            case 805:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271686038528L);
            case 806:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593589513356673L);
            case 807:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593117067019208L);
            case 808:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636758062487L);
            case 809:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636758128024L);
            case 810:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636757996950L);
            case 811:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593645347931586L);
            case 813:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983926899524L);
            case 815:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593563743618424L);
            case 816:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593563743749497L);
            case 817:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593563743815034L);
            case 818:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593563743552887L);
            case 819:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867232321564L);
            case 820:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867232387101L);
            case 821:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867232452638L);
            default:
                return null;
        }
    }

    private Long A0I(int i) {
        switch (i) {
            case 822:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867232124955L);
            case 823:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867231600663L);
            case 824:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867231666200L);
            case 825:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867231731737L);
            case 826:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867232583711L);
            case 827:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777765978818L);
            case 829:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593632463029653L);
            case 830:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794944799442L);
            case 831:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794944733905L);
            case 833:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794944996051L);
            case 834:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794945061588L);
            case 838:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593606693225870L);
            case 839:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593606693356943L);
            case 844:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593649643095494L);
            case 845:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593649642964420L);
            case 846:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593649643029957L);
            case 847:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593649642898883L);
            case 848:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348997153939L);
            case 849:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593649643161031L);
            case 850:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348997219476L);
            case 851:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348997285013L);
            case 852:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039759311771L);
            case 853:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593666822768078L);
            case 854:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593666822899151L);
            case 858:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636758193561L);
            case 859:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636758324634L);
            case 860:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979628458787L);
            case 862:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991785783382L);
            case 863:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991785914455L);
            case 865:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593718362375642L);
            case 866:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593748427146720L);
            case 867:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593748427277793L);
            case 868:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404103823843L);
            case 869:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593752722179554L);
            case 871:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081981866220L);
            case 872:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112045064482L);
            case 873:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593761312048617L);
            case 874:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593765607015914L);
            case 875:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593765607081451L);
            case 876:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593765607146988L);
            case 878:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593778491983345L);
            case 883:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593787081852405L);
            case 885:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979628589860L);
            case 888:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112045261091L);
            case 891:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592047620227235L);
            case 903:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593778492179954L);
            case 904:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593787081917942L);
            case 905:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593855801329159L);
            case 906:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271686431748L);
            case 907:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271686497285L);
            case 908:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271686562822L);
            case 909:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593847211394563L);
            case 910:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593847211460100L);
            case 911:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593817146623487L);
            case 917:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593804261787129L);
            case 918:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452075386179L);
            case 919:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592064800227546L);
            case 920:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592064800293083L);
            case 921:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592064800358620L);
            case 922:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592064800489693L);
            case 923:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592064800162009L);
            case 924:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404103889380L);
            case 925:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593885866100237L);
            case 926:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056213242042L);
            case 929:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593894456034830L);
            case 930:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593894456100367L);
            case 934:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593903045969427L);
            case 935:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593903046034964L);
            case 936:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593104182117318L);
            case 938:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594134974203477L);
            case 939:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594122089301574L);
            case 940:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593765607343598L);
            case 941:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593765607278061L);
            case 942:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979628655397L);
            case 943:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593778492245491L);
            case 944:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593860096296459L);
            case 946:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348997350550L);
            case 947:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594165038974553L);
            case 948:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594165039040090L);
            case 951:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056213504187L);
            case 952:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594160744007256L);
            case 954:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348997547161L);
            case 957:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443485582606L);
            case 958:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443485648143L);
            case 959:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443485713680L);
            case 960:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594190808778376L);
            case 962:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348997416087L);
            case 963:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348997481624L);
            case 964:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591781332385797L);
            case 968:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169334203995L);
            case 971:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043326177436L);
            case 972:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971038393095L);
            case 973:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971038130948L);
            case 974:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971038196485L);
            case 975:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971038262022L);
            case 976:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971038524169L);
            case 977:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971038458632L);
            case 978:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229463484053L);
            case 979:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592064800555230L);
            case 981:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593499319305552L);
            case 983:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451347612155L);
            case 984:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593207261529068L);
            case 985:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081982521581L);
            case 987:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443486172436L);
            case 988:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443486237973L);
            case 989:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443485910289L);
            case 990:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443486041362L);
            case 991:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443486106899L);
            case 992:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056213569724L);
            case 993:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594255233353381L);
            case 996:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081982783726L);
            case 998:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271686628359L);
            case 999:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112045457700L);
            case IgNetworkConsentStorage.MAX_ENTRIES /*1000*/:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594263823287975L);
            case 1001:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594263823222438L);
            case 1024:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039759639453L);
            case 1025:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039759573916L);
            case 1026:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979628720934L);
            case 1027:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443486369046L);
            case 1029:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594311067862699L);
            case 1032:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594323952764590L);
            case 1033:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971039048464L);
            case 1034:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971038720779L);
            case 1035:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971038786316L);
            case 1036:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971038851853L);
            case 1037:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971038917390L);
            case 1038:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971038982927L);
            case 1039:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971038655242L);
            case 1040:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594332542699183L);
            case 1041:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594332542830256L);
            case 1042:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081982980335L);
            case 1048:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867231797274L);
            case 1049:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594203693745803L);
            case 1050:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594203693811340L);
            case 1051:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594203693876877L);
            case 1052:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594203693680266L);
            case 1053:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592734815191713L);
            case 1054:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593117067084745L);
            case 1055:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594285298058921L);
            case 1059:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594371197470405L);
            case 1060:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451347677692L);
            case 1061:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081983111408L);
            case 1062:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983926965061L);
            case 1064:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594384082306760L);
            case 1065:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594384082372297L);
            case 1066:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592129225064775L);
            case 1067:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592129225130312L);
            case 1068:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592129225195849L);
            case 1069:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592129225261386L);
            case 1070:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592129225326923L);
            case 1072:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594315362895532L);
            case 1073:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594315362961069L);
            case 1078:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594371197601478L);
            case 1079:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594371197667015L);
            case 1080:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592764879831728L);
            case 1088:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594422737471189L);
            case 1089:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594422737012433L);
            case 1092:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594422737209042L);
            case 1094:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594422737340115L);
            case 1095:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594422737405652L);
            default:
                return null;
        }
    }

    private Long A0J(int i) {
        switch (i) {
            case 3290:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454259296723L);
            case 3291:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599688367050348L);
            case 3292:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175084259686L);
            case 3296:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271690626091L);
            case 3297:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288208891033L);
            case 3300:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600736338939874L);
            case 3301:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087072087435L);
            case 3302:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600736339005411L);
            case 3303:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596548746152476L);
            case 3304:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724840532575L);
            case 3305:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724840598112L);
            case 3306:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724840794723L);
            case 3307:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724840663649L);
            case 3308:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724840729186L);
            case 3309:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636761601464L);
            case 3310:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636761667001L);
            case 3311:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600792173514733L);
            case 3312:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600792173580270L);
            case 3313:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600792173711343L);
            case 3314:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598563085618404L);
            case 3315:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598563085552867L);
            case 3316:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349003904210L);
            case 3317:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175084652907L);
            case 3318:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600813648351222L);
            case 3319:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600809353383924L);
            case 3320:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600263893258047L);
            case 3321:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600263893126973L);
            case 3322:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600263893192510L);
            case 3324:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387651400944L);
            case 3325:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387651466481L);
            case 3328:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759929617344L);
            case 3329:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600487230836616L);
            case 3331:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600487231033225L);
            case 3333:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594422738257627L);
            case 3334:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759929813953L);
            case 3335:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351282194L);
            case 3336:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349004035283L);
            case 3337:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991786569822L);
            case 3338:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214683850L);
            case 3339:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214290628L);
            case 3340:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214356165L);
            case 3341:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214421702L);
            case 3342:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214487239L);
            case 3343:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214552776L);
            case 3344:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214618313L);
            case 3345:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349004100820L);
            case 3346:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288209611939L);
            case 3347:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288209218718L);
            case 3348:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288209284255L);
            case 3349:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454260214238L);
            case 3350:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454260279775L);
            case 3351:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288208956570L);
            case 3352:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288209022107L);
            case 3353:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288209087644L);
            case 3354:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288209153181L);
            case 3355:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288209349792L);
            case 3356:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288209480865L);
            case 3357:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288209546402L);
            case 3358:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593207262118896L);
            case 3359:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351413267L);
            case 3360:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349003773136L);
            case 3361:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349003838673L);
            case 3362:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349003707599L);
            case 3364:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593610989700498L);
            case 3366:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593258801791994L);
            case 3367:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596548746283550L);
            case 3368:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596548746218013L);
            case 3369:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596548746349087L);
            case 3370:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351478804L);
            case 3371:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454260345312L);
            case 3372:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454260410849L);
            case 3373:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883755109031L);
            case 3374:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883755174568L);
            case 3375:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883755240105L);
            case 3376:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759929879490L);
            case 3377:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804990019426L);
            case 3378:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724840991332L);
            case 3380:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991786635359L);
            case 3381:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601006921879624L);
            case 3382:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601006921945161L);
            case 3384:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925317959734L);
            case 3385:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925318025271L);
            case 3386:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925318090808L);
            case 3387:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925318156345L);
            case 3388:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925318221882L);
            case 3389:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925318287419L);
            case 3390:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925318352956L);
            case 3391:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925318418493L);
            case 3392:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925318484030L);
            case 3393:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925318549567L);
            case 3394:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925318615104L);
            case 3395:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925317500975L);
            case 3396:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925317566512L);
            case 3397:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925317632049L);
            case 3398:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925317697586L);
            case 3399:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925317763123L);
            case 3400:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925317828660L);
            case 3401:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925317894197L);
            case 3402:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597880185752622L);
            case 3403:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794945585881L);
            case 3406:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271690757164L);
            case 3407:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271690822701L);
            case 3408:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601049871683674L);
            case 3409:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601049871880284L);
            case 3410:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601049871814747L);
            case 3411:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601049871552600L);
            case 3412:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601049871618137L);
            case 3413:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599654007246440L);
            case 3414:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271690888238L);
            case 3415:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597540883336024L);
            case 3416:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837238635532L);
            case 3417:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271690953775L);
            case 3418:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600989742272582L);
            case 3419:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600989742207045L);
            case 3420:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600989742141508L);
            case 3421:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600989742338119L);
            case 3422:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601049871945821L);
            case 3424:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593610989766035L);
            case 3425:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601122885996654L);
            case 3426:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216650256152L);
            case 3427:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596548746414624L);
            case 3428:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592584491860610L);
            case 3429:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592567311598191L);
            case 3430:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271691019312L);
            case 3431:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596892343339694L);
            case 3432:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443492726070L);
            case 3433:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593323225646180L);
            case 3434:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600843713122304L);
            case 3435:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257417263882L);
            case 3436:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257417329419L);
            case 3437:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257417394956L);
            case 3438:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598537315945696L);
            case 3439:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600792173842416L);
            case 3442:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387651990770L);
            case 3444:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595569493674163L);
            case 3446:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799467733L);
            case 3448:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799533270L);
            case 3449:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079210974916L);
            case 3450:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079211040453L);
            case 3451:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079211105990L);
            case 3452:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079211171527L);
            case 3453:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601157245997176L);
            case 3454:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601157245735028L);
            case 3455:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601157245800565L);
            case 3456:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601157245866102L);
            case 3457:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601157245931639L);
            case 3458:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594916659234790L);
            case 3459:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594916659300327L);
            case 3460:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216650583833L);
            case 3462:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351544341L);
            case 3464:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349004231893L);
            case 3469:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351675415L);
            case 3470:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351740952L);
            case 3471:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351806489L);
            case 3472:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351872026L);
            case 3473:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351609878L);
            case 3474:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601298979655814L);
            case 3475:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351937563L);
            case 3476:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837238701069L);
            case 3477:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837238766606L);
            case 3478:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601384879067291L);
            case 3479:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601384879001754L);
            case 3480:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601384879132828L);
            case 3481:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451352003100L);
            case 3483:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601397764034724L);
            case 3484:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601397764100261L);
            case 3485:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601397764165798L);
            case 3487:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601397764296871L);
            case 3488:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601397764362408L);
            case 3490:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592584491926147L);
            case 3491:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600538770575257L);
            case 3494:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593301751989336L);
            case 3496:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601402058870953L);
            case 3497:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601470778347724L);
            case 3499:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601402058936490L);
            case 3500:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601371994099862L);
            case 3501:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601371994165399L);
            case 3502:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601371994230936L);
            case 3503:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601492253184215L);
            case 3504:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601492253249752L);
            case 3505:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601492253315289L);
            case 3506:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454260738532L);
            case 3507:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454260804069L);
            case 3508:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454260541922L);
            case 3509:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454260607459L);
            case 3510:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601522317955292L);
            case 3511:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601500843184346L);
            case 3512:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595118522173466L);
            case 3514:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601560972660974L);
            case 3515:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642577367296L);
            case 3516:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642577432833L);
            case 3517:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601049872207966L);
            case 3518:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642577236222L);
            case 3519:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642577301759L);
            case 3521:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079211237064L);
            case 3522:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079211302601L);
            case 3523:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799664343L);
            case 3524:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593301752054873L);
            case 3525:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601664051876145L);
            case 3526:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595655392692447L);
            case 3528:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600925318746177L);
            case 3529:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087072218509L);
            case 3530:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601719886450998L);
            case 3531:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601719886516535L);
            case 3532:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601719886582072L);
            case 3533:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601719886647609L);
            case 3535:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087072152972L);
            case 3536:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599443554242069L);
            case 3537:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599885935873683L);
            case 3539:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452076369223L);
            case 3540:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601419238740144L);
            case 3541:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601419238805681L);
            case 3542:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601419238871218L);
            case 3543:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601419238936755L);
            case 3544:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601419239002292L);
            case 3546:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112047292725L);
            case 3548:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837238897679L);
            case 3550:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597609602878310L);
            case 3551:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214749387L);
            case 3552:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592047620292772L);
            case 3553:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349004297430L);
            case 3558:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601874505273708L);
            case 3559:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593610989831572L);
            case 3560:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451352199709L);
            case 3561:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596754904648300L);
            case 3564:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592902318850801L);
            default:
                return null;
        }
    }

    private Long A0K(int i) {
        switch (i) {
            case 3566:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601719886713146L);
            case 3567:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454260869606L);
            case 3568:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596754904582763L);
            case 3569:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214814924L);
            case 3570:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214880461L);
            case 3571:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837238963216L);
            case 3572:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837239028753L);
            case 3573:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960404619652L);
            case 3574:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960404947335L);
            case 3575:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960405012872L);
            case 3576:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960404816261L);
            case 3577:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960404881798L);
            case 3578:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601981879456147L);
            case 3579:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056215011535L);
            case 3580:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214945998L);
            case 3581:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651167039763L);
            case 3582:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651167105300L);
            case 3583:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087072284046L);
            case 3588:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597880185818159L);
            case 3589:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599326138L);
            case 3590:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599391675L);
            case 3591:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599457212L);
            case 3592:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599522749L);
            case 3593:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599588286L);
            case 3594:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599653823L);
            case 3595:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599719360L);
            case 3596:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599784897L);
            case 3597:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599850434L);
            case 3598:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599915971L);
            case 3599:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599981508L);
            case ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS /*3600*/:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050598932916L);
            case 3601:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050598998453L);
            case 3602:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599063990L);
            case 3603:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599129527L);
            case 3604:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599195064L);
            case 3605:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050599260601L);
            case 3606:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288209677476L);
            case 3607:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288209743013L);
            case 3608:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602067778802207L);
            case 3609:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651167170837L);
            case 3610:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451352265246L);
            case 3611:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597472164842309L);
            case 3612:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059189588440L);
            case 3613:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059189653977L);
            case 3614:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059189850588L);
            case 3615:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059189916125L);
            case 3616:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059189981662L);
            case 3617:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059189391829L);
            case 3618:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059189457366L);
            case 3619:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063484490235L);
            case 3620:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063484555772L);
            case 3621:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063484621309L);
            case 3622:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063484686846L);
            case 3623:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063484752383L);
            case 3624:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063484817920L);
            case 3625:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063484883457L);
            case 3626:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063484948994L);
            case 3627:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063484359161L);
            case 3628:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063484424698L);
            case 3630:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059189719514L);
            case 3631:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059189785051L);
            case 3632:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059189522903L);
            case 3633:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600147928747759L);
            case 3634:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642577563907L);
            case 3635:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642577498370L);
            case 3636:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642577629444L);
            case 3638:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059190112736L);
            case 3639:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063485014531L);
            case 3640:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063485080068L);
            case 3641:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059190047199L);
            case 3642:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651167236374L);
            case 3643:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598313977515179L);
            case 3644:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598313977580716L);
            case 3647:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651167301911L);
            case 3648:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651167367448L);
            case 3649:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593207262184433L);
            case 3650:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592047620358309L);
            case 3652:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594886595119062L);
            case 3653:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454260935143L);
            case 3654:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454261000680L);
            case 3655:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601719886778683L);
            case 3656:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601719886844220L);
            case 3657:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601719886909757L);
            case 3658:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601719886975294L);
            case 3659:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592047620423846L);
            case 3660:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593804262049276L);
            case 3661:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602578879976109L);
            case 3663:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601122886193263L);
            case 3664:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452076500297L);
            case 3665:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452076434760L);
            case 3666:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570290565785L);
            case 3667:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570290631322L);
            case 3668:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570290696859L);
            case 3669:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799926491L);
            case 3670:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799992028L);
            case 3671:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087800057565L);
            case 3672:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087800123102L);
            case 3674:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799729880L);
            case 3675:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799795417L);
            case 3676:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799860954L);
            case 3677:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642577694981L);
            case 3678:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601006922141770L);
            case 3679:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087800254175L);
            case 3680:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570289975954L);
            case 3681:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570290041491L);
            case 3682:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570290107028L);
            case 3683:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570290172565L);
            case 3685:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570290303638L);
            case 3686:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570290369175L);
            case 3688:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570290500248L);
            case 3689:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593301752120410L);
            case 3691:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209668660L);
            case 3692:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595655392757984L);
            case 3693:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636761929148L);
            case 3694:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636761798074L);
            case 3695:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636761863611L);
            case 3696:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592047620554920L);
            case 3697:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960405143946L);
            case 3698:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960405209483L);
            case 3699:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960405078409L);
            case 3700:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837239094290L);
            case 3701:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651167629593L);
            case 3702:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837239159827L);
            case 3703:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349005018327L);
            case 3704:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454261459435L);
            case 3705:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454261656044L);
            case 3706:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454261721581L);
            case 3707:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454261197289L);
            case 3708:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454261393898L);
            case 3709:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592047620489383L);
            case 3710:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063485145605L);
            case 3711:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063485211142L);
            case 3712:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063485276679L);
            case 3713:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063485342216L);
            case 3714:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063485407753L);
            case 3715:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063485473290L);
            case 3716:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059190178273L);
            case 3717:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059190243810L);
            case 3718:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059190309347L);
            case 3719:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059190374884L);
            case 3720:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059190440421L);
            case 3721:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059190505958L);
            case 3722:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651167695130L);
            case 3723:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595638213282012L);
            case 3724:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454261787118L);
            case 3738:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602613239648947L);
            case 3739:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830767425471L);
            case 3740:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830767491008L);
            case 3741:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830767556545L);
            case 3742:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830767622082L);
            case 3743:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830767687619L);
            case 3744:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830767359934L);
            case 3745:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601290389983364L);
            case 3746:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039761212322L);
            case 3747:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602630419518142L);
            case 3748:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593383355057375L);
            case 3749:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759929945027L);
            case 3750:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759930010564L);
            case 3751:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759930076101L);
            case 3752:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601981879587220L);
            case 3753:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600792173973489L);
            case 3754:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086280306961L);
            case 3755:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602673369191109L);
            case 3756:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991786897504L);
            case 3757:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602639009452736L);
            case 3758:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451352330783L);
            case 3759:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602733498864364L);
            case 3760:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602733498929901L);
            case 3761:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602733498995438L);
            case 3762:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602733498798827L);
            case 3763:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271691084849L);
            case 3764:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602742088667887L);
            case 3765:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602742088733424L);
            case 3766:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602742088864497L);
            case 3767:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991786963041L);
            case 3771:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867233435688L);
            case 3772:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867233501225L);
            case 3773:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867233239077L);
            case 3774:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867233304614L);
            case 3775:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867233370151L);
            case 3776:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651167760667L);
            case 3777:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789333373699L);
            case 3778:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789333439236L);
            case 3779:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789333504773L);
            case 3780:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789333570310L);
            case 3781:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789333635847L);
            case 3782:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789333701384L);
            case 3783:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789333766921L);
            case 3784:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789333832458L);
            case 3785:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789333897995L);
            case 3786:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789333963532L);
            case 3787:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789334029069L);
            case 3788:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789334094606L);
            case 3789:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789334160143L);
            case 3790:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789334225680L);
            case 3791:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789334291217L);
            case 3792:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789334356754L);
            case 3793:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789334422291L);
            case 3794:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059190571495L);
            case 3795:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063485538827L);
            case 3796:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789334487828L);
            case 3797:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789333308162L);
            case 3798:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991787028578L);
            case 3800:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602806513242928L);
            case 3801:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602806513308465L);
            case 3802:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602806513177391L);
            case 3803:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602853758210877L);
            case 3804:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602853758276414L);
            case 3806:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680504823756L);
            case 3807:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680504889293L);
            case 3808:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680504758219L);
            case 3809:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602806513374002L);
            case 3810:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601006922207307L);
            case 3811:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601006922272844L);
            case 3812:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602883822588743L);
            case 3813:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602883822654280L);
            case 3814:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602883822719817L);
            case 3815:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602922477294417L);
            case 3816:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602922477359954L);
            case 3817:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602922477425491L);
            case 3818:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602922477491028L);
            case 3819:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602922477556565L);
            case 3822:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602935362261846L);
            case 3823:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602939657163607L);
            case 3824:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050600047045L);
            case 3825:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271691150386L);
            case 3826:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050600178119L);
            case 3827:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050600243656L);
            case 3828:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050600309193L);
            case 3829:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050600112582L);
            case 3830:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642578153734L);
            case 3831:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642578219271L);
            case 3832:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216650911514L);
            case 3833:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603029851476837L);
            case 3834:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642578284808L);
            case 3835:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603055621280614L);
            case 3836:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271691215923L);
            case 3837:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837239225364L);
            case 3838:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209865271L);
            default:
                return null;
        }
    }

    private Long A0L(int i) {
        switch (i) {
            case 3839:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209930808L);
            case 3840:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209734197L);
            case 3841:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209799734L);
            case 3842:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596754904713837L);
            case 3843:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595354745309312L);
            case 3844:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830767753156L);
            case 3845:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603162995463036L);
            case 3847:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991787094115L);
            case 3848:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216650977051L);
            case 3849:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216651042588L);
            case 3850:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603180175332223L);
            case 3851:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087072415119L);
            case 3852:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603124341019512L);
            case 3853:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603124340822903L);
            case 3855:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056215470291L);
            case 3856:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056215273680L);
            case 3857:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056215339217L);
            case 3858:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056215404754L);
            case 3859:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059190637032L);
            case 3860:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059190702569L);
            case 3861:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063485604364L);
            case 3862:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063485669901L);
            case 3863:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789334553365L);
            case 3864:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789334618902L);
            case 3865:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593894456296977L);
            case 3866:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651167826204L);
            case 3867:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603253189776275L);
            case 3869:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501503019538L);
            case 3870:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501503085075L);
            case 3871:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501502954001L);
            case 3872:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387652056307L);
            case 3873:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597472164907846L);
            case 3874:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603300434416542L);
            case 3875:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603300434482079L);
            case 3876:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651167957277L);
            case 3877:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599563813260884L);
            case 3878:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651168022814L);
            case 3879:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603347679056800L);
            case 3880:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602617534943925L);
            case 3881:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602617534878388L);
            case 3882:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837239290901L);
            case 3883:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837239356438L);
            case 3884:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314705485292L);
            case 3885:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314705550829L);
            case 3887:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602617535206071L);
            case 3888:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602617535271608L);
            case 3889:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602617535337145L);
            case 3890:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451352396320L);
            case 3891:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451352461857L);
            case 3892:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651168088351L);
            case 3893:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454261918191L);
            case 3894:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271691478068L);
            case 3895:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271691543605L);
            case 3896:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991787159652L);
            case 3899:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602617535140534L);
            case 3900:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593778492704244L);
            case 3902:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271691609142L);
            case 3904:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601006922338381L);
            case 3905:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603502298010544L);
            case 3906:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603502298076081L);
            case 3907:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603502298141618L);
            case 3908:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603502297879470L);
            case 3909:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603502297945007L);
            case 3910:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603480823042985L);
            case 3911:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603480823108522L);
            case 3912:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603480823174059L);
            case 3913:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603480823239596L);
            case 3914:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603480823305133L);
            case 3916:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642578546953L);
            case 3917:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883755305642L);
            case 3918:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883755371179L);
            case 3919:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593009693033354L);
            case 3920:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050600374730L);
            case 3921:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079211368138L);
            case 3922:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601049872273503L);
            case 3923:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603356268991393L);
            case 3924:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602673369387718L);
            case 3926:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602617535533754L);
            case 3927:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603390628729762L);
            case 3928:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600843713777671L);
            case 3929:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600843713712134L);
            case 3931:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600843713581060L);
            case 3932:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600843713187841L);
            case 3933:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600843713646597L);
            case 3934:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600843713318914L);
            case 3935:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600843713384451L);
            case 3936:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603180175397760L);
            case 3937:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603180175463297L);
            case 3938:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603180175528834L);
            case 3939:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598064869608536L);
            case 3940:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867233566762L);
            case 3941:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867233697835L);
            case 3942:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288209808550L);
            case 3943:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288209874087L);
            case 3944:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603180175594371L);
            case 3945:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651168153888L);
            case 3947:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594792104527704L);
            case 3948:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063486128657L);
            case 3949:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063486194194L);
            case 3950:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789334881047L);
            case 3951:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789334946584L);
            case 3952:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789335012121L);
            case 3953:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789335077658L);
            case 3954:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789335143195L);
            case 3955:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059190964714L);
            case 3956:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059191030251L);
            case 3957:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059191095788L);
            case 3958:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059191161325L);
            case 3959:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059191226862L);
            case 3960:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063485932046L);
            case 3961:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063485997583L);
            case 3962:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063486063120L);
            case 3963:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651168219425L);
            case 3964:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454261983728L);
            case 3965:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603626851931078L);
            case 3966:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804990084963L);
            case 3967:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570290762396L);
            case 3969:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603583902258112L);
            case 3971:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059191357935L);
            case 3972:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063486325267L);
            case 3973:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789335274268L);
            case 3976:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960405340557L);
            case 3977:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960405406094L);
            case 3978:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960405471631L);
            case 3979:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960405537168L);
            case 3980:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960405602705L);
            case 3981:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601960405275020L);
            case 3982:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314705681902L);
            case 3983:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314705747439L);
            case 3984:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314705812976L);
            case 3985:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520795059556L);
            case 3986:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063486521877L);
            case 3987:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789335339805L);
            case 3988:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789335470878L);
            case 3989:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063486390804L);
            case 3991:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372654197160L);
            case 3992:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257417460493L);
            case 3993:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209996345L);
            case 3994:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050600440267L);
            case 3995:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600263893323584L);
            case 3997:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680505020366L);
            case 3998:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050600505804L);
            case 3999:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603824420426709L);
            case 4001:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603562427421622L);
            case 4002:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598064869674073L);
            case 4003:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603858780361694L);
            case 4004:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603858780427231L);
            case 4005:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603858780492768L);
            case 4006:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603858780558305L);
            case 4007:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603858780623842L);
            case 4008:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603858780689379L);
            case 4009:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603858780754916L);
            case 4010:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603858780820453L);
            case 4011:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603858780230620L);
            case 4012:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603858780296157L);
            case 4014:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454262049265L);
            case 4015:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059191489008L);
            case 4016:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063486652950L);
            case 4017:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789335601951L);
            case 4018:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598726294375691L);
            case 4019:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059191751154L);
            case 4020:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063486718487L);
            case 4021:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063486915096L);
            case 4022:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789335667488L);
            case 4023:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789335929633L);
            case 4024:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059191554545L);
            case 4025:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087072546192L);
            case 4026:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087072611729L);
            case 4029:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602806513439539L);
            case 4030:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36603162995528573L);
            case 4032:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602617535730363L);
            case 4033:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789336060706L);
            case 4034:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059191882227L);
            case 4035:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063487046169L);
            case 4036:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979630097199L);
            case 4037:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520795190629L);
            case 4038:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063487111706L);
            case 4039:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789336126243L);
            case 4040:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059192013301L);
            case 4041:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063487177243L);
            case 4042:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789336191780L);
            case 4043:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059191947764L);
            case 4044:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597880185883696L);
            case 4045:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597880185949233L);
            case 4046:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050600571341L);
            case 4047:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050600636878L);
            case 4048:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050600702415L);
            case 4049:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050600767952L);
            case 4050:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602617535795900L);
            case 4051:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604090708530179L);
            case 4053:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593847211787782L);
            case 4054:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593804262114813L);
            case 4056:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636761994685L);
            case 4057:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451352592930L);
            case 4058:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050600899025L);
            case 4059:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604150837941269L);
            case 4061:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604163722843158L);
            case 4062:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597815761374177L);
            case 4063:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600809353449461L);
            case 4064:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604210967483422L);
            case 4065:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600813648416759L);
            case 4068:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597609602943847L);
            case 4069:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593331815580777L);
            case 4070:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520795256166L);
            case 4071:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594126385514066L);
            case 4073:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602806513570612L);
            case 4078:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604421420880944L);
            case 4080:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604442895717433L);
            case 4081:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600538770837402L);
            case 4083:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349006132441L);
            case 4084:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349006066904L);
            case 4085:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271691740215L);
            case 4086:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271691805752L);
            case 4087:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592902319244018L);
            case 4088:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642578940173L);
            case 4089:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642578612490L);
            case 4091:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642578743563L);
            case 4092:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642578809100L);
            case 4094:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604378471207980L);
            case 4095:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387652121844L);
            case 4097:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651168416034L);
            case 4101:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680505282511L);
            case 4102:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680505675729L);
            case 4103:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680505610192L);
            case 4104:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604627579311174L);
            case 4105:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604687708918876L);
            case 4106:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604687708984413L);
            case 4107:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604687708853339L);
            case 4108:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804990412644L);
            case 4109:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804990478181L);
            case 4110:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837239618583L);
            case 4112:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604752133428322L);
            default:
                return null;
        }
    }

    private Long A0M(int i) {
        switch (i) {
            case 4113:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349006197978L);
            case 4114:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597815761439714L);
            case 4117:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604765018264679L);
            case 4118:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651168481571L);
            case 4119:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604425715848241L);
            case 4120:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599795741167223L);
            case 4121:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601006922403918L);
            case 4122:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601006922469455L);
            case 4123:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314706140657L);
            case 4124:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680505806802L);
            case 4125:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804990543718L);
            case 4126:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789336257317L);
            case 4127:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059192078838L);
            case 4128:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063487242780L);
            case 4129:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543725181099L);
            case 4130:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604923932120189L);
            case 4131:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604923932185726L);
            case 4132:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604923932054652L);
            case 4133:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605044191138993L);
            case 4135:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759930141638L);
            case 4136:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759930207175L);
            case 4137:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759930272712L);
            case 4138:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112047358262L);
            case 4139:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759930338249L);
            case 4140:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759930403786L);
            case 4141:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759930469323L);
            case 4142:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759930534860L);
            case 4144:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759930600397L);
            case 4145:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759930665934L);
            case 4146:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759930731471L);
            case 4147:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604773608199272L);
            case 4148:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604773608264809L);
            case 4149:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404104348137L);
            case 4150:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595625328511188L);
            case 4151:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595625328576725L);
            case 4152:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595625328642262L);
            case 4153:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595625328445651L);
            case 4157:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592382628331980L);
            case 4159:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991787225189L);
            case 4160:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604872392447090L);
            case 4161:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680505937875L);
            case 4162:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592906613752564L);
            case 4163:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592382628397517L);
            case 4164:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297594602717L);
            case 4165:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297594668254L);
            case 4166:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297594733791L);
            case 4167:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297594209495L);
            case 4168:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297594275032L);
            case 4169:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297594340569L);
            case 4170:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297594406106L);
            case 4171:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297594471643L);
            case 4172:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297594537180L);
            case 4173:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605052781073586L);
            case 4174:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605379198588143L);
            case 4177:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314706533875L);
            case 4180:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592906613818101L);
            case 4181:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592584492450437L);
            case 4182:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592584492384900L);
            case 4183:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086280503571L);
            case 4184:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086280438034L);
            case 4185:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314706206194L);
            case 4186:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605112910615736L);
            case 4187:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605112910681273L);
            case 4188:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605228874732753L);
            case 4189:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605228874798290L);
            case 4190:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830767818693L);
            case 4191:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883755567788L);
            case 4192:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297594930401L);
            case 4193:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297594995938L);
            case 4194:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297594799328L);
            case 4195:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297595061475L);
            case 4198:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086280569108L);
            case 4199:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605615421789464L);
            case 4202:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605563882181903L);
            case 4205:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599851575742078L);
            case 4206:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595170062239809L);
            case 4207:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595170062305346L);
            case 4208:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595170062370883L);
            case 4209:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452076565834L);
            case 4210:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602742089126643L);
            case 4211:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602742089061106L);
            case 4212:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596754904779374L);
            case 4214:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605301889176808L);
            case 4216:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601006922666065L);
            case 4217:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601006922600528L);
            case 4218:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605873119892812L);
            case 4219:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605868824859977L);
            case 4220:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605868824925514L);
            case 4221:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605873119827275L);
            case 4222:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314706730484L);
            case 4224:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454262114802L);
            case 4225:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602742089192180L);
            case 4226:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520795452775L);
            case 4227:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271691936826L);
            case 4228:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271691871289L);
            case 4230:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570290893469L);
            case 4232:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452076631371L);
            case 4233:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595028327860228L);
            case 4234:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595028327925765L);
            case 4235:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595028327991302L);
            case 4236:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595028327729154L);
            case 4237:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595028327794691L);
            case 4238:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606289731655028L);
            case 4239:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606289731720565L);
            case 4240:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606255371916655L);
            case 4241:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451352658467L);
            case 4242:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451352724004L);
            case 4243:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606379926033826L);
            case 4244:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570291024543L);
            case 4245:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570291090080L);
            case 4246:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570291155617L);
            case 4247:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570290959006L);
            case 4248:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602742089257717L);
            case 4249:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602742089323254L);
            case 4251:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606397105837485L);
            case 4253:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087072677266L);
            case 4254:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087072742803L);
            case 4255:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837239749656L);
            case 4256:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593589514077573L);
            case 4258:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606491595118011L);
            case 4260:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604872392578164L);
            case 4261:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604872392840309L);
            case 4262:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604872392905846L);
            case 4263:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606616149169630L);
            case 4264:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604872392971383L);
            case 4265:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604872392512627L);
            case 4266:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606616149235167L);
            case 4268:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611854202316L);
            case 4269:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611854267853L);
            case 4270:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611854333390L);
            case 4271:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606379926164899L);
            case 4273:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600813648547832L);
            case 4274:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601088526389355L);
            case 4275:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600843713843208L);
            case 4276:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372654262697L);
            case 4277:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372654328234L);
            case 4279:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520795518312L);
            case 4280:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606852372436472L);
            case 4281:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606852372829690L);
            case 4282:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606852372764153L);
            case 4283:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606848077403639L);
            case 4284:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591978900881487L);
            case 4285:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606929681782271L);
            case 4286:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606470120347057L);
            case 4287:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602939657229144L);
            case 4288:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611854529999L);
            case 4289:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611854661073L);
            case 4290:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611854595536L);
            case 4291:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087072808340L);
            case 4292:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087072873877L);
            case 4293:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087072939414L);
            case 4294:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642579398929L);
            case 4295:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642579136782L);
            case 4296:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642579202319L);
            case 4297:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601642579267856L);
            case 4298:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607101480474125L);
            case 4299:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611854726610L);
            case 4300:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607118660343311L);
            case 4301:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607015581128200L);
            case 4302:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594126385579603L);
            case 4309:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600843713908745L);
            case 4310:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371337475484L);
            case 4311:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371337737632L);
            case 4312:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371337541021L);
            case 4313:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371337803169L);
            case 4314:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371337606558L);
            case 4315:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371337278873L);
            case 4316:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371337344410L);
            case 4317:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336164744L);
            case 4318:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336230281L);
            case 4319:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336295818L);
            case 4320:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336361355L);
            case 4321:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336426892L);
            case 4322:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336492429L);
            case 4323:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336557966L);
            case 4324:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336623503L);
            case 4325:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336689040L);
            case 4326:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336754577L);
            case 4327:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336820114L);
            case 4328:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336885651L);
            case 4329:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336951188L);
            case 4330:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371337016725L);
            case 4331:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336033670L);
            case 4332:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371337409947L);
            case 4333:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371336099207L);
            case 4334:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371337672095L);
            case 4335:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371337082262L);
            case 4336:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371337147799L);
            case 4337:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606371337213336L);
            case 4338:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601088526520428L);
            case 4339:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598064869739610L);
            case 4341:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602806513832758L);
            case 4342:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602806513701685L);
            case 4343:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607110070408718L);
            case 4344:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600813648613369L);
            case 4346:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607324818773543L);
            case 4347:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607324818839080L);
            case 4348:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607324818904617L);
            case 4349:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607324818970154L);
            case 4350:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607324819035691L);
            case 4351:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607324819101228L);
            case 4352:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607324819166765L);
            case 4353:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611854923219L);
            case 4355:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050601095635L);
            case 4356:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050601030098L);
            case 4357:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830767949767L);
            case 4358:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830759823215L);
            case 4359:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830759888752L);
            case 4360:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830768015304L);
            case 4361:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830768080841L);
            case 4362:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830768146378L);
            case 4363:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830759561068L);
            case 4364:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830767884230L);
            case 4365:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594126385645140L);
            case 4366:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271692002363L);
            case 4367:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520795583849L);
            case 4368:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680506200020L);
            case 4369:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592734815716006L);
            case 4370:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607466552694347L);
            case 4372:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087003296703L);
            case 4373:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651168547108L);
            case 4374:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570291352228L);
            case 4375:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570291417765L);
            case 4376:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570291221154L);
            case 4377:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570291286691L);
            case 4378:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605731391018289L);
            case 4379:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605731391804722L);
            case 4380:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605731391870259L);
            case 4381:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605731391935796L);
            case 4382:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598159358758006L);
            case 4383:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598159358823543L);
            case 4384:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598159358889080L);
            case 4385:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607694185961062L);
            case 4386:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680506265557L);
            default:
                return null;
        }
    }

    private Long A0N(int i) {
        switch (i) {
            case 4387:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680506462167L);
            case 4388:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680506331094L);
            case 4389:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607754315503221L);
            case 4390:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607599696680543L);
            case 4391:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601006922731602L);
            case 4392:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601006922797139L);
            case 4393:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601006922928212L);
            case 4394:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570291483302L);
            case 4395:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607883164522119L);
            case 4396:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372654590379L);
            case 4397:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611855054292L);
            case 4399:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271692067900L);
            case 4400:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271692133437L);
            case 4401:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607986243737233L);
            case 4402:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608024898508435L);
            case 4403:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349006329051L);
            case 4404:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349006394588L);
            case 4405:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600813648678906L);
            case 4406:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608140862625436L);
            case 4407:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608140862690973L);
            case 4408:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608140862756510L);
            case 4409:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608140862559899L);
            case 4410:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570291745448L);
            case 4411:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570291679911L);
            case 4412:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604872393036920L);
            case 4413:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651168612645L);
            case 4414:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794945651418L);
            case 4415:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602742089388791L);
            case 4416:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602742089454328L);
            case 4417:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595217306421341L);
            case 4418:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595221601388645L);
            case 4419:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608334136088230L);
            case 4420:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608334136153767L);
            case 4421:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680506527704L);
            case 4423:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314706796021L);
            case 4424:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404104413674L);
            case 4425:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608450100205263L);
            case 4426:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271692198974L);
            case 4427:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431579825L);
            case 4428:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431645362L);
            case 4432:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431710899L);
            case 4433:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431776436L);
            case 4434:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431841973L);
            case 4435:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431907510L);
            case 4436:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431973047L);
            case 4437:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338432038584L);
            case 4438:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338432104121L);
            case 4439:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338432169658L);
            case 4440:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338432235195L);
            case 4441:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431055529L);
            case 4442:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431121066L);
            case 4443:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431186603L);
            case 4444:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431252140L);
            case 4445:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431317677L);
            case 4446:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431383214L);
            case 4447:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338432300732L);
            case 4448:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431448751L);
            case 4449:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338431514288L);
            case 4450:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608381380728516L);
            case 4451:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297595127012L);
            case 4452:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608527409616601L);
            case 4453:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602050601161172L);
            case 4454:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608523114649304L);
            case 4455:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608621898897122L);
            case 4456:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608621898962659L);
            case 4457:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608660553602797L);
            case 4458:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608651963668200L);
            case 4459:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608651963864811L);
            case 4460:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608651963930348L);
            case 4461:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608651963733737L);
            case 4462:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608651963799274L);
            case 4463:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608334136219304L);
            case 4465:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608780812687104L);
            case 4466:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600813648744443L);
            case 4467:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600813648809980L);
            case 4469:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608381380794053L);
            case 4470:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608381380859590L);
            case 4471:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608381380925127L);
            case 4472:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609021330855699L);
            case 4473:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570291810985L);
            case 4474:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601290390048901L);
            case 4475:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175949678378L);
            case 4476:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602806514029368L);
            case 4477:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602806513963831L);
            case 4478:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593009693098891L);
            case 4479:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601122886389873L);
            case 4480:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601122886455410L);
            case 4481:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601122886324336L);
            case 4482:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595195831781453L);
            case 4483:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950137134L);
            case 4485:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175949809451L);
            case 4486:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175949874988L);
            case 4487:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950071597L);
            case 4488:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271692264511L);
            case 4489:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271692330048L);
            case 4490:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271692395585L);
            case 4491:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593731247408604L);
            case 4492:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591927361863742L);
            case 4493:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591927361929279L);
            case 4494:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591927361994816L);
            case 4495:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609347748370273L);
            case 4496:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789336322854L);
            case 4497:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602789336388391L);
            case 4498:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059192144375L);
            case 4499:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602059192209912L);
            case 4500:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063487373853L);
            case 4501:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602063487439390L);
            case 4502:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950202671L);
            case 4503:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36607466552759884L);
            case 4504:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36602570291876522L);
            case 4505:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598593150323946L);
            case 4506:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271692461122L);
            case 4507:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950333745L);
            case 4508:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950399282L);
            case 4509:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950464819L);
            case 4510:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950268208L);
            case 4511:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608780812752641L);
            case 4512:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950530356L);
            case 4513:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950595893L);
            case 4514:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950661430L);
            case 4515:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950726967L);
            case 4516:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950792504L);
            case 4517:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680506593241L);
            case 4518:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338432366269L);
            case 4519:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271692526659L);
            case 4520:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636762060222L);
            case 4521:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636762125759L);
            case 4522:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636762191296L);
            case 4523:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636762256833L);
            case 4524:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680506658778L);
            case 4525:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608338432431806L);
            case 4526:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611855185366L);
            case 4527:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611855119829L);
            case 4528:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950858041L);
            case 4529:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950923578L);
            case 4530:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175950989115L);
            case 4531:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175951054652L);
            case 4532:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175951120189L);
            case 4533:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175951185726L);
            case 4534:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175951251263L);
            case 4535:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175951316800L);
            case 4536:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175951382337L);
            case 4537:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175951447874L);
            case 4538:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175951513411L);
            case 4539:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609055690725145L);
            case 4540:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609055690594072L);
            case 4541:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609055690987292L);
            case 4542:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609055691052829L);
            case 4543:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609055690856218L);
            case 4544:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609055690921755L);
            case 4545:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595097047861268L);
            case 4546:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596943883733702L);
            case 4547:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175951644485L);
            case 4548:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609175951578948L);
            case 4550:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609858849478592L);
            case 4551:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609858849675202L);
            case 4552:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609858849609665L);
            case 4553:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451353510437L);
            case 4554:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609949043791815L);
            case 4555:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608527409682138L);
            case 4556:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271692657733L);
            case 4557:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271692592196L);
            case 4558:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271692723270L);
            case 4559:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611855447511L);
            case 4560:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611855513048L);
            case 4562:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36610172382091242L);
            case 4563:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36610172382156779L);
            case 4564:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36610172382222316L);
            case 4565:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36610271166339059L);
            case 4566:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520795714922L);
            case 4567:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297595258086L);
            case 4568:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297595192549L);
            case 4570:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087003427776L);
            case 4571:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271693050952L);
            case 4572:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271692985415L);
            case 4573:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604773608395882L);
            case 4574:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520795780459L);
            case 4575:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36610468734834689L);
            case 4576:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605297595520231L);
            case 4577:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271693116489L);
            case 4578:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271693182026L);
            case 4579:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611855644121L);
            case 4580:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599417784307210L);
            case 4581:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651168678182L);
            case 4582:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36601651168743719L);
            case 4583:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611855775194L);
            case 4584:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36610451555293184L);
            case 4585:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36610451555031037L);
            case 4586:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36610451555096574L);
            case 4587:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36610451555162111L);
            case 4588:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314706927094L);
            case 4589:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759930797008L);
            case 4590:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36610833807055012L);
            case 4591:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598159358954617L);
            case 4592:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520795845996L);
            case 4593:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520795911533L);
            case 4594:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609055691118366L);
            case 4595:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609055691183903L);
            case 4596:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609055691249440L);
            case 4597:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611855971803L);
            case 4598:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611856037340L);
            case 4599:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087003493313L);
            case 4600:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597880186211378L);
            case 4601:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451353575974L);
            case 4602:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608780812883715L);
            case 4603:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608780812818178L);
            case 4604:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36608780812949252L);
            case 4605:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597880186276915L);
            case 4606:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597880186342452L);
            case 4607:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777767027401L);
            case 4608:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611499526985959L);
            case 4609:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451353641511L);
            case 4610:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594783514396499L);
            case 4611:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520795977070L);
            case 4612:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451353772585L);
            case 4613:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451353838122L);
            case 4614:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451353707048L);
            case 4615:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847419730199L);
            case 4616:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847419795736L);
            case 4617:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847419468051L);
            case 4618:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847419533588L);
            case 4619:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847419599125L);
            case 4620:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847419664662L);
            case 4621:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847419336977L);
            case 4622:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847419402514L);
            case 4623:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520796042607L);
            case 4624:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611856009271584L);
            case 4625:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36605615421855001L);
            case 4626:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520796108144L);
            case 4627:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451353903659L);
            case 4628:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451353969196L);
            case 4629:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451354034733L);
            case 4630:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451354100270L);
            case 4631:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36612238261360950L);
            case 4632:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847419861273L);
            case 4633:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847419926810L);
            case 4635:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847420057883L);
            case 4636:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847420123420L);
            case 4637:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847420188957L);
            case 4638:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847420254494L);
            case 4639:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36611847420320031L);
            case 4640:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372654655916L);
            case 4641:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592674686173846L);
            case 4642:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175084783980L);
            case 4643:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36609949043857352L);
            case 4644:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606379926230436L);
            case 4645:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451354165807L);
            case 4646:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36606611856102877L);
            case 4648:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36612332750969155L);
            case 4649:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36612332751034692L);
            case 4650:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36612332751296839L);
            case 4651:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36612332750903618L);
            case 4652:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36612332751100229L);
            case 4653:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36612332751427912L);
            case 4654:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36612332751231302L);
            case 4655:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36612324160772417L);
            case 4656:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592906614014710L);
            case 4657:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36612534614104409L);
            case 4658:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36604163722908695L);
            case 4659:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112047423799L);
            case 4660:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087003689922L);
            case 4661:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804990674791L);
            default:
                return null;
        }
    }

    private Long A0O(int i) {
        switch (i) {
            case 1096:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593336110613614L);
            case 1097:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593336110679151L);
            case 1098:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443486500119L);
            case 1103:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594457096750821L);
            case 1104:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594461391718119L);
            case 1106:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594452802176738L);
            case 1107:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594452801783516L);
            case 1108:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594452801849053L);
            case 1109:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594452801914590L);
            case 1110:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594452801980127L);
            case 1111:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594452802045664L);
            case 1112:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594452802111201L);
            case 1117:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452075713860L);
            case 1119:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593791376885239L);
            case 1120:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594512931325681L);
            case 1122:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594482866554603L);
            case 1123:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594538701129472L);
            case 1124:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443486565656L);
            case 1125:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443486631193L);
            case 1126:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443486827803L);
            case 1127:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443486762266L);
            case 1128:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594508636358382L);
            case 1130:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777766109891L);
            case 1131:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592034735653001L);
            case 1134:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594525816227570L);
            case 1140:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594555880998664L);
            case 1143:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451348070909L);
            case 1146:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593855801394696L);
            case 1147:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991786045528L);
            case 1153:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443487352092L);
            case 1154:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443487548703L);
            case 1155:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443487417629L);
            case 1156:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443487483166L);
            case 1157:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594590240737053L);
            case 1158:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594620305508142L);
            case 1159:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594620305573679L);
            case 1160:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594620305639216L);
            case 1161:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593499319371089L);
            case 1165:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594422737536726L);
            case 1167:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594603125638950L);
            case 1169:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591781332451334L);
            case 1171:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592382627873225L);
            case 1172:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594650370279220L);
            case 1173:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594637485377331L);
            case 1174:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594654665246517L);
            case 1176:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593718362441179L);
            case 1177:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271686693896L);
            case 1178:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636758455707L);
            case 1181:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594573061195531L);
            case 1182:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594701909886779L);
            case 1183:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594714794788670L);
            case 1184:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594126384793163L);
            case 1185:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594126384858700L);
            case 1186:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594126384924237L);
            case 1187:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594126384989774L);
            case 1188:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594126384662089L);
            case 1189:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594126384727626L);
            case 1190:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594654665377590L);
            case 1192:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086277554433L);
            case 1193:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086277488896L);
            case 1194:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086277619970L);
            case 1195:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443487679776L);
            case 1196:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594727679821636L);
            case 1197:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594727679887173L);
            case 1202:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594727679690562L);
            case 1203:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594727679756099L);
            case 1204:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387650024674L);
            case 1205:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594770629363534L);
            case 1206:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594783514265426L);
            case 1207:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594744859559754L);
            case 1208:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594573061457676L);
            case 1210:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594792104200020L);
            case 1211:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594779219494737L);
            case 1212:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594779219429200L);
            case 1213:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594671845115703L);
            case 1214:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594671845181240L);
            case 1215:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594762039428941L);
            case 1217:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593589513749890L);
            case 1218:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086277685507L);
            case 1219:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086277751044L);
            case 1220:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804989101913L);
            case 1221:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804989167450L);
            case 1222:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594452802307811L);
            case 1223:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271686956042L);
            case 1224:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271686890505L);
            case 1225:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594813579036520L);
            case 1228:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830758905706L);
            case 1229:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086277947653L);
            case 1231:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086278078726L);
            case 1232:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592064800620767L);
            case 1233:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594843643807691L);
            case 1234:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594822168971113L);
            case 1236:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594860823676877L);
            case 1237:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594852233742284L);
            case 1239:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591978900815950L);
            case 1241:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594882298513362L);
            case 1242:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594508636423919L);
            case 1246:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404104085990L);
            case 1247:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404104020453L);
            case 1248:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594869413611470L);
            case 1249:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594869413677007L);
            case 1257:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594886593480659L);
            case 1258:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594886593546196L);
            case 1259:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594886593611733L);
            case 1267:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591781332516871L);
            case 1274:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086278406407L);
            case 1275:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086278471944L);
            case 1276:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348997612698L);
            case 1279:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594920953219048L);
            case 1286:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592734815257250L);
            case 1295:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594963902957556L);
            case 1296:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594916658382814L);
            case 1297:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594916658448351L);
            case 1299:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086278537481L);
            case 1300:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595028327401469L);
            case 1301:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595028327467006L);
            case 1302:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595028327532543L);
            case 1307:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594959607990254L);
            case 1308:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593301750940756L);
            case 1312:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086278603018L);
            case 1313:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594457096816358L);
            case 1317:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595011147597819L);
            case 1320:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595071277074444L);
            case 1325:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086278734092L);
            case 1326:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086278668555L);
            case 1327:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595071277139981L);
            case 1328:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595071277205518L);
            case 1329:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595041212368905L);
            case 1331:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520794469725L);
            case 1332:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520794535262L);
            case 1333:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520794600799L);
            case 1334:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520794666336L);
            case 1335:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520794731873L);
            case 1336:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520794797410L);
            case 1337:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520794404188L);
            case 1338:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043326242973L);
            case 1339:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043326308510L);
            case 1340:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594959608055791L);
            case 1341:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387650090211L);
            case 1342:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595131406616615L);
            case 1343:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348997678235L);
            case 1351:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595135701583916L);
            case 1353:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595122816682011L);
            case 1354:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595118521911320L);
            case 1355:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595118521976857L);
            case 1356:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595118521714709L);
            case 1357:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595118521780246L);
            case 1358:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595118521845783L);
            case 1359:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595131406682152L);
            case 1360:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979628917543L);
            case 1361:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595127111714845L);
            case 1363:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595127111845918L);
            case 1364:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595127111911455L);
            case 1365:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595127111976992L);
            case 1366:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595127112042529L);
            case 1367:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595127111649308L);
            case 1369:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595139996551217L);
            case 1370:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595139996616754L);
            default:
                return null;
        }
    }

    private Long A0P(int i) {
        switch (i) {
            case 1371:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595139996682291L);
            case 1372:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595165766354999L);
            case 1373:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595165766420536L);
            case 1374:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595165766486073L);
            case 1375:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271687021579L);
            case 1376:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595148586485813L);
            case 1379:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595097046878223L);
            case 1380:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595097047009296L);
            case 1381:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595170061322298L);
            case 1384:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591781332582408L);
            case 1385:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595208716027989L);
            case 1388:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595182946224196L);
            case 1390:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595195831126086L);
            case 1391:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595217306028119L);
            case 1392:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595217306093656L);
            case 1393:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595217306159193L);
            case 1394:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595217306224730L);
            case 1395:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595217306290267L);
            case 1396:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595217306355804L);
            case 1397:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595221600929886L);
            case 1398:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595221600995423L);
            case 1399:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595221601060960L);
            case 1400:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595221601126497L);
            case 1401:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595221601192034L);
            case 1402:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595221601257571L);
            case 1403:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595217305962582L);
            case 1404:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595221601323108L);
            case 1406:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595191536158789L);
            case 1412:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443487941921L);
            case 1413:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443488007458L);
            case 1415:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056213700798L);
            case 1416:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056213635261L);
            case 1417:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443488072995L);
            case 1418:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595251665832040L);
            case 1419:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595251665766503L);
            case 1420:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595251665700966L);
            case 1422:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348997743772L);
            case 1429:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595135701649453L);
            case 1430:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595135701714990L);
            case 1431:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595028327598080L);
            case 1433:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348997809309L);
            case 1434:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595277435504746L);
            case 1435:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595281730472044L);
            case 1436:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443488269606L);
            case 1437:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443488138532L);
            case 1438:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443488204069L);
            case 1439:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271687087116L);
            case 1440:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593520794862947L);
            case 1444:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592975333557017L);
            case 1445:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592975333622554L);
            case 1446:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592975333688091L);
            case 1447:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592975333753628L);
            case 1448:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592975333491480L);
            case 1450:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595316090210420L);
            case 1451:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595316090341493L);
            case 1452:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595350449948792L);
            case 1453:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595350450014329L);
            case 1454:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595350450079866L);
            case 1455:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595354744916091L);
            case 1456:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592116340097340L);
            case 1457:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592116340162877L);
            case 1458:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592116340228414L);
            case 1459:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592116340031803L);
            case 1460:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593855801460233L);
            case 1461:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593855801591306L);
            case 1463:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086278865165L);
            case 1467:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593589513815427L);
            case 1468:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595298910341232L);
            case 1469:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593117067215818L);
            case 1470:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595389104654477L);
            case 1471:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593207261594605L);
            case 1472:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594727679952710L);
            case 1473:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594727680018247L);
            case 1474:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593903046362648L);
            case 1475:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593903046100501L);
            case 1476:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593903046166038L);
            case 1477:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593903046231575L);
            case 1478:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387650155748L);
            case 1479:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387650221285L);
            case 1480:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593610988717456L);
            case 1481:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112045785384L);
            case 1482:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112045850921L);
            case 1483:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112045916458L);
            case 1484:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112045981995L);
            case 1485:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112046047532L);
            case 1486:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112045588773L);
            case 1487:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112045654310L);
            case 1488:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112045719847L);
            case 1490:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592116340359488L);
            case 1491:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592116340425025L);
            case 1492:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592116340293951L);
            case 1493:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592395513889240L);
            case 1495:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592395513823703L);
            case 1496:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056213766335L);
            case 1498:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087002969020L);
            case 1499:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087003034557L);
            case 1502:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595436349294738L);
            case 1506:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592395513954777L);
            case 1510:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595131406747689L);
            case 1511:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595470709033108L);
            case 1525:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830761265026L);
            case 1526:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830760675194L);
            case 1527:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830760740731L);
            case 1528:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830760806268L);
            case 1529:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830760871805L);
            case 1530:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830761330563L);
            case 1531:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830761396100L);
            case 1532:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830758971243L);
            case 1533:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830760937342L);
            case 1534:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830759954289L);
            case 1535:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830760019826L);
            case 1536:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830760085363L);
            case 1537:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830760150900L);
            case 1538:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830761068415L);
            case 1539:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830761133952L);
            case 1540:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830760281973L);
            case 1541:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830760347510L);
            case 1542:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830760413047L);
            case 1543:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830760478584L);
            case 1544:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830760544121L);
            case 1545:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830761199489L);
            case 1547:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591996080750695L);
            case 1548:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593499319436626L);
            case 1557:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593860096361996L);
            case 1562:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593087003100094L);
            case 1564:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451349250558L);
            case 1565:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595569493346478L);
            case 1566:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595569493280941L);
            case 1567:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543724329126L);
            case 1568:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543723477147L);
            case 1569:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543723542684L);
            case 1571:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543723673757L);
            case 1572:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543723739294L);
            case 1573:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543723804831L);
            case 1574:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543723870368L);
            case 1575:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543723935905L);
            case 1576:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543724001442L);
            case 1577:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543724066979L);
            case 1578:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543724132516L);
            case 1579:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543724198053L);
            case 1580:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443488531751L);
            case 1581:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443488597288L);
            case 1582:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443488924969L);
            case 1583:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443489056042L);
            case 1585:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056213831872L);
            case 1586:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595354744981628L);
            case 1587:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591781332647945L);
            case 1588:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592481412055615L);
            case 1589:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592567311532654L);
            case 1591:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991786111065L);
            case 1594:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595097047074833L);
            case 1595:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086278996238L);
            case 1596:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086279061775L);
            case 1597:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595131406813226L);
            case 1601:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595599558052038L);
            case 1602:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595633917855961L);
            case 1603:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595633917790424L);
            case 1607:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593336111006832L);
            case 1608:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443489318187L);
            case 1609:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830761527173L);
            case 1611:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595655392626910L);
            case 1612:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595131406944299L);
            case 1613:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595659687594209L);
            case 1614:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595651097725149L);
            case 1615:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595629622823127L);
            case 1618:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592034735784074L);
            case 1619:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595638212757722L);
            case 1621:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595625327855818L);
            case 1622:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595625327921355L);
            case 1623:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595625327986892L);
            case 1624:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595625328052429L);
            case 1625:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595694047398116L);
            case 1627:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593207261791214L);
            case 1628:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595694047332579L);
            case 1629:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595694047463653L);
            case 1634:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592734815322787L);
            case 1635:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271687545869L);
            case 1638:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595706932234476L);
            case 1640:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595277435570283L);
            case 1641:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595281730537581L);
            case 1642:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595702637267175L);
            case 1643:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595702637332712L);
            case 1644:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595702637398249L);
            default:
                return null;
        }
    }

    private Long A0Q(int i) {
        switch (i) {
            case 1645:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595702637463786L);
            case 1646:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595702637529323L);
            case ReactTextInputManager.IME_ACTION_ID:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595689752365282L);
            case 1655:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595316090472566L);
            case 1656:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595754176874743L);
            case 1657:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595758471842040L);
            case 1658:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594126385055311L);
            case 1659:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348998333598L);
            case 1660:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348998464671L);
            case 1661:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595728407070963L);
            case 1662:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595706932365550L);
            case 1666:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595706932300013L);
            case 1667:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591781332713482L);
            case 1668:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595711227201778L);
            case 1670:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595797126547712L);
            case 1673:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595810011449602L);
            case 1678:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595852961122573L);
            case 1679:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595706932431087L);
            case 1681:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595814306482438L);
            case 1682:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595814306416901L);
            case 1685:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794945323733L);
            case 1688:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595857256155408L);
            case 1690:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039760753566L);
            case 1696:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591927361142844L);
            case 1702:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595810011515139L);
            case 1705:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595943155435799L);
            case 1706:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595943155501336L);
            case 1707:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595943155566873L);
            case 1708:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595943155632410L);
            case 1716:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595951745370395L);
            case 1718:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595170061649979L);
            case 1719:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595170061715516L);
            case 1720:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594422737733335L);
            case 1724:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592554427155044L);
            case 1725:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112046309680L);
            case 1727:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112046440753L);
            case 1728:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112046113069L);
            case 1729:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112046178606L);
            case 1730:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112046244143L);
            case 1731:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595981810141477L);
            case 1734:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595981810338086L);
            case 1735:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595981810403623L);
            case 1736:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593301751071829L);
            case 1737:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387650352359L);
            case 1738:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387650286822L);
            case 1739:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595170061781053L);
            case 1740:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595170061846590L);
            case 1741:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979629441832L);
            case 1742:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348998530208L);
            case 1748:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594916658579424L);
            case 1749:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596059119618347L);
            case 1750:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596059119683884L);
            case 1751:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596059119552810L);
            case 1752:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592013260816497L);
            case 1753:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592013260750960L);
            case 1759:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595170061912127L);
            case 1760:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595170061977664L);
            case 1762:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592395514610139L);
            case 1763:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592395514544602L);
            case 1764:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594916658776033L);
            case 1765:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348998661281L);
            case 1767:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081983308017L);
            case 1770:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596080594389304L);
            case 1774:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594916658841570L);
            case 1775:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594126385251920L);
            case 1778:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596110659160380L);
            case 1779:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348998726818L);
            case 1782:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595569493412015L);
            case 1783:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595569493477552L);
            case 1784:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762051465L);
            case 1785:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830761789319L);
            case 1786:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762117002L);
            case 1787:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762182539L);
            case 1788:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830761592710L);
            case 1789:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830761985928L);
            case 1790:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594122089367111L);
            case 1792:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271687808014L);
            case 1793:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271688004623L);
            case 1794:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983927358278L);
            case 1795:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596127839226188L);
            case 1796:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596127839029577L);
            case 1797:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596127839095114L);
            case 1798:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596127839160651L);
            case 1802:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594620305835825L);
            case 1803:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596132133996878L);
            case 1804:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596059119749421L);
            case 1805:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543724722343L);
            case 1808:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596080594454841L);
            case 1811:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596140723931477L);
            case 1813:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175083932001L);
            case 1814:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175083669853L);
            case 1815:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175083735390L);
            case 1816:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175083800927L);
            case 1817:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175083997538L);
            case 1818:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175083866464L);
            case 1819:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596110659225917L);
            case 1823:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595603853150407L);
            case 1824:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983927423815L);
            case 1825:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596226623277432L);
            case 1826:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596230918244729L);
            case 1827:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596183673604461L);
            case 1828:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596183673669998L);
            case 1829:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596183673735535L);
            case 1830:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592034735849611L);
            case 1831:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271688070160L);
            case 1833:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596170788702556L);
            case 1835:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591781332910091L);
            case 1836:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596153608833367L);
            case 1837:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596153608898904L);
            case 1838:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596157903800665L);
            case 1839:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596213738375536L);
            case 1840:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404104282600L);
            case 1841:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592404104217063L);
            case 1846:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594869413742544L);
            case 1847:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596282457852289L);
            case 1851:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596295342754180L);
            case 1857:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596213738441073L);
            case 1858:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596213738506610L);
            case 1859:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596213738572147L);
            case 1860:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596316817590662L);
            case 1861:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596316817656199L);
            case 1863:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596110659291454L);
            case 1864:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271688266771L);
            case 1865:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271688135697L);
            case 1866:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595822896417033L);
            case 1867:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271688201234L);
            case 1868:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595135701780527L);
            case 1871:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596351177329036L);
            case 1872:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596351177394573L);
            case 1873:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596351177460110L);
            case 1874:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596351177525647L);
            case 1875:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596351177591184L);
            case 1876:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596351177656721L);
            case 1877:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595758471907577L);
            case 1882:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081983504626L);
            case 1886:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596445666609591L);
            case 1888:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596424191904179L);
            case 1891:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596428486740404L);
            case 1892:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596441371642293L);
            case 1894:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596441371773366L);
            case 1895:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596376947263919L);
            case 1896:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595810011580676L);
            case 1897:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596376947132845L);
            case 1898:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596376947198382L);
            case 1899:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596376947329456L);
            case 1900:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592683275518619L);
            case 1901:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372652165525L);
            case 1902:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372652231062L);
            case 1903:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372652296599L);
            case 1905:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596213738637684L);
            case 1907:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596475731380732L);
            case 1910:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596505796151828L);
            case 1914:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592541541466714L);
            case 1915:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454256609731L);
            case 1917:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454256740804L);
            case 1918:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454256544194L);
            default:
                return null;
        }
    }

    private Long A0R(int i) {
        switch (i) {
            case 1922:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596548745824791L);
            case 1923:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596548745890328L);
            case 1924:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596548745955865L);
            case 1925:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596548746021402L);
            case 1927:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596561630726692L);
            case 1928:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596557335890466L);
            case 1929:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348999054499L);
            case 1930:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348999120036L);
            case 1931:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387650417896L);
            case 1933:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595028327663617L);
            case 1935:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348999316646L);
            case 1937:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348999251109L);
            case 1938:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596591695694383L);
            case 1939:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596591695497772L);
            case 1940:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596591695563309L);
            case 1941:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596591695628846L);
            case 1942:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596595990465072L);
            case 1946:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596256688310653L);
            case 1947:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596256688048508L);
            case 1948:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596256688507262L);
            case 1955:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596449961773504L);
            case 1958:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594959608580080L);
            case 1960:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596595990727218L);
            case 1961:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596595990596145L);
            case 1962:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777766372036L);
            case 1963:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593383354991838L);
            case 1965:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592992512967500L);
            case 1967:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596651825039935L);
            case 1968:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348999775400L);
            case 1969:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348999840937L);
            case 1971:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593348999644327L);
            case 1972:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594126385317457L);
            case 1973:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596316817721736L);
            case 1974:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443490170157L);
            case 1977:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443490039084L);
            case 1978:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596110659356991L);
            case 1980:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596669004909126L);
            case 1981:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596669004974663L);
            case 1982:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596669005040200L);
            case 1984:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592588786238090L);
            case 1985:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596213738834293L);
            case 1987:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596505796282901L);
            case 1988:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596110659488064L);
            case 1991:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596213738965367L);
            case 1992:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596213738899830L);
            case 1997:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596750609287783L);
            case 2001:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724839942745L);
            case 2002:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724839615061L);
            case 2003:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724839680598L);
            case 2004:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724839746135L);
            case 2005:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724839483987L);
            case 2006:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724839549524L);
            case 2007:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724839811672L);
            case 2009:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596733429418597L);
            case 2010:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596763494189679L);
            case 2011:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592554427351653L);
            case 2012:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596754904386153L);
            case 2013:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596754904320616L);
            case 2014:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596059119880494L);
            case 2015:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596059120011567L);
            case 2016:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596776379091571L);
            case 2017:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777766437573L);
            case 2018:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443491153199L);
            case 2019:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443491218736L);
            case 2021:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443491087662L);
            case 2022:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983927489352L);
            case 2031:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804989364059L);
            case 2032:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451349447167L);
            case 2033:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443491415346L);
            case 2035:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443491349809L);
            case 2037:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039760819103L);
            case 2038:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595139996747828L);
            case 2040:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596853688502928L);
            case 2041:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372652624280L);
            case 2042:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372652689817L);
            case 2043:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349000168618L);
            case 2044:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592554427744870L);
            case 2045:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596836508633734L);
            case 2046:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592382628069834L);
            case 2047:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592382628135371L);
            case C249703kE.FLAG_MOVED:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883753274001L);
            case 2049:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883753339538L);
            case 2050:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372652755354L);
            case 2051:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596802148895357L);
            case 2056:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596797853928060L);
            case 2058:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596896638175919L);
            case 2059:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596892343208621L);
            case 2060:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596849393535626L);
            case 2061:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081983766772L);
            case 2062:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081983832309L);
            case 2063:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081983701235L);
            case 2065:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596905228110513L);
            case 2066:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596905228176050L);
            case 2067:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596905228241587L);
            case 2068:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596905228307124L);
            case 2069:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596905228372661L);
            case 2075:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592734815388324L);
            case 2077:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883753405075L);
            case 2078:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883753470612L);
            case 2079:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883753536149L);
            case 2080:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883753601686L);
            case 2081:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883753667223L);
            case 2082:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883753732760L);
            case 2083:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883753798297L);
            case 2084:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883753863834L);
            case 2085:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883753929371L);
            case 2086:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883753994908L);
            case 2087:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883754060445L);
            case 2088:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883754125982L);
            case 2089:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883754191519L);
            case 2090:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883754257056L);
            case 2091:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883754322593L);
            case 2092:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883754388130L);
            case 2093:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883754453667L);
            case 2094:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883754519204L);
            case 2095:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883754584741L);
            case 2096:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596883754650278L);
            case 2097:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596965357652679L);
            case 2099:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596943882816188L);
            case 2100:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596943883143869L);
            case 2101:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596943883209406L);
            case 2103:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451349578240L);
            case 2106:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594482866947820L);
            case 2113:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597004012358352L);
            case 2119:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081983897846L);
            case 2120:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081983963383L);
            case 2121:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596587400596011L);
            case 2123:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595097047271443L);
            case 2124:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595097047140370L);
            case 2125:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597025487260370L);
            case 2127:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597012602292945L);
            case 2128:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595694047660262L);
            case 2129:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349000299691L);
            case 2132:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596127839488333L);
            case 2134:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443492070707L);
            case 2135:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594959608711153L);
            case 2136:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594959608776690L);
            case 2137:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592863664669409L);
            case 2138:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387650483433L);
            case 2142:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596849393601163L);
            case 2144:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593336111137905L);
            case 2145:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597107091573471L);
            case 2146:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867232911392L);
            case 2147:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596445666740664L);
            case 2148:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596445666806201L);
            case 2149:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596445666871738L);
            case 2150:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596445666937275L);
            case 2151:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596445667002812L);
            case 2152:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596445667068349L);
            case 2153:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596445667133886L);
            case 2154:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596445667199423L);
            case 2158:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597051256998613L);
            case 2159:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597051257064150L);
            case 2160:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597141451311841L);
            case 2161:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724840008282L);
            case 2164:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593336111268978L);
            case 2165:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595569493543089L);
            case 2166:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595354745112701L);
            case 2167:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595354745178238L);
            case 2169:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595148586551350L);
            case 2171:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443492136244L);
            case 2172:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081984159992L);
            case 2174:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597197285886696L);
            case 2177:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597214465755884L);
            case 2178:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592064800686304L);
            case 2179:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595706932955376L);
            case 2181:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271688659990L);
            case 2182:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271688332308L);
            case 2183:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271688397845L);
            case 2186:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039761015712L);
            case 2187:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597266005363472L);
            case 2191:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777766503110L);
            case 2192:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372653279648L);
            default:
                return null;
        }
    }

    private Long A0S(int i) {
        switch (i) {
            case 2193:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372652951963L);
            case 2194:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372653017500L);
            case 2195:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372653083037L);
            case 2196:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372653148574L);
            case 2197:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372653214111L);
            case 2199:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597154336344807L);
            case 2200:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596849393666700L);
            case 2201:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594792104331093L);
            case 2202:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594792104396630L);
            case 2204:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596110659815745L);
            case 2205:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597300365101841L);
            case 2206:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592571606631027L);
            case 2207:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597141451377378L);
            case 2208:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597141451442915L);
            case 2209:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597308955036439L);
            case 2210:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594122089498184L);
            case 2211:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451349709314L);
            case 2212:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451349643777L);
            case 2213:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169334531679L);
            case 2214:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169334597216L);
            case 2215:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169334662753L);
            case 2216:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169334728290L);
            case 2217:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169334793827L);
            case 2218:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169334859364L);
            case 2219:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169334924901L);
            case 2220:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169334990438L);
            case 2221:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335055975L);
            case 2222:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335121512L);
            case 2223:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335187049L);
            case 2224:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335252586L);
            case 2225:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335318123L);
            case 2226:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335383660L);
            case 2227:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335449197L);
            case 2228:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335514734L);
            case 2229:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335580271L);
            case 2230:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335645808L);
            case 2231:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335711345L);
            case 2232:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335776882L);
            case 2233:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335842419L);
            case 2234:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335907956L);
            case 2235:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169335973493L);
            case 2236:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169336039030L);
            case 2237:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169336104567L);
            case 2238:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169336170104L);
            case 2239:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169336235641L);
            case 2240:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169336301178L);
            case 2241:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169336366715L);
            case 2242:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169334335068L);
            case 2243:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169334400605L);
            case 2244:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594169334466142L);
            case 2245:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597326134905625L);
            case 2247:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454256871877L);
            case 2248:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596832213731973L);
            case 2251:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592683275584156L);
            case 2254:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372653345185L);
            case 2255:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257416018684L);
            case 2257:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257415822074L);
            case 2258:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257415428854L);
            case 2259:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257415953147L);
            case 2260:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257415494391L);
            case 2262:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597394854382374L);
            case 2263:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501501250046L);
            case 2264:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501501315583L);
            case 2265:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501501381120L);
            case 2266:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501501446657L);
            case 2271:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501501708804L);
            case 2272:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501501643267L);
            case 2273:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501501512194L);
            case 2274:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595625328117966L);
            case 2275:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593336111531125L);
            case 2276:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372653476258L);
            case 2280:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597472163793723L);
            case 2281:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597472163924796L);
            case 2282:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349000430764L);
            case 2283:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349000496301L);
            case 2284:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597485048695634L);
            case 2285:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593537974011253L);
            case 2286:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597497933597524L);
            case 2287:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593804261852666L);
            case 2288:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595135701846064L);
            case 2290:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597519408434005L);
            case 2291:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597519408499542L);
            case 2296:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592455642186290L);
            case 2297:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592455642251827L);
            case 2298:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081984291065L);
            case 2299:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594792104462167L);
            case 2300:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597540883270487L);
            case 2301:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724840139355L);
            case 2303:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593039761081249L);
            case 2304:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596110660274498L);
            case 2305:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724840204892L);
            case 2306:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593903046428185L);
            case 2307:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593903046493722L);
            case 2308:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593903046559259L);
            case 2309:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595041212434442L);
            case 2310:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596110660340035L);
            case 2311:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257416149757L);
            case 2312:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257416215294L);
            case 2313:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257416280831L);
            case 2314:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257416346368L);
            case 2315:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257416411905L);
            case 2316:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257416477442L);
            case 2317:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257416542979L);
            case 2318:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257416608516L);
            case 2319:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387650548970L);
            case 2320:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979629507369L);
            case 2324:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271688856599L);
            case 2326:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271688922136L);
            case 2327:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501501839877L);
            case 2328:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349000627375L);
            case 2329:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349000561838L);
            case 2330:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597609602747237L);
            case 2332:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762313613L);
            case 2333:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762379150L);
            case 2334:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762444687L);
            case 2335:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762510224L);
            case 2336:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762575761L);
            case 2337:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762641298L);
            case 2338:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762706835L);
            case 2339:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762772372L);
            case 2340:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762837909L);
            case 2341:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762903446L);
            case 2342:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830762248076L);
            case 2343:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596110660405572L);
            case 2344:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597592423009117L);
            case 2345:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597592423074654L);
            case 2346:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597141451508452L);
            case 2347:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597141451573989L);
            case 2348:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597141451639526L);
            case 2350:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597738451766168L);
            case 2351:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597738452028315L);
            case 2352:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597738451897241L);
            case 2353:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597738451962778L);
            case 2354:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867232976929L);
            case 2355:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867233042466L);
            case 2356:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867233108003L);
            case 2357:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451349774851L);
            case 2358:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349000758448L);
            case 2359:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349000823985L);
            case 2360:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349000889522L);
            case 2361:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349000955059L);
            case 2362:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636758652316L);
            case 2363:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594671845246777L);
            case 2365:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597768516537308L);
            case 2366:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597472163990333L);
            case 2369:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595569493608626L);
            case 2370:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591867233173540L);
            case 2371:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593589513946500L);
            case 2373:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759926668194L);
            case 2374:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759926602657L);
            case 2375:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349001151670L);
            case 2376:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349001020596L);
            case 2377:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349001086133L);
            case 2378:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349001217207L);
            case 2379:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724840335966L);
            case 2380:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596724840270429L);
            case 2381:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454257068486L);
            case 2382:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592971039114001L);
            case 2383:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597815761243104L);
            case 2384:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236210671L);
            case 2385:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236276208L);
            case 2386:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236341745L);
            case 2387:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236407282L);
            case 2388:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236472819L);
            case 2389:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236538356L);
            case 2390:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236603893L);
            case 2391:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236669430L);
            case 2392:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236014060L);
            case 2393:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236079597L);
            case 2394:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236145134L);
            case 2395:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454257134023L);
            case 2398:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597472164252481L);
            case 2399:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597472164055870L);
            case 2400:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597472164121407L);
            case 2401:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597472164186944L);
            case 2402:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229464532639L);
            case 2403:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229464008345L);
            case 2404:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229464598176L);
            case 2405:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229464139418L);
            case 2406:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229464663713L);
            case 2407:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229464336028L);
            case 2408:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229463615126L);
            case 2409:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229464270491L);
            case 2410:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229464401565L);
            case 2411:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229463746199L);
            case 2412:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229464467102L);
            case 2413:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229463877272L);
            case 2414:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229464729250L);
            case 2415:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229464794787L);
            case 2416:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594229464860324L);
            case 2417:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597704092027770L);
            case 2420:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597880185687085L);
            case 2421:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593074117477291L);
            case 2422:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759926799267L);
            case 2423:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595127112108066L);
            case 2424:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595127112173603L);
            case 2425:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595127112239140L);
            case 2427:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595195831191623L);
            case 2428:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271689053209L);
            case 2429:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596849393797774L);
            case 2430:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596849393863311L);
            case 2431:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596849393732237L);
            case 2434:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597940315229250L);
            case 2435:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595195831257160L);
            case 2440:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257415559928L);
            case 2441:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257415625465L);
            case 2442:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597918840392764L);
            case 2443:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597918840458301L);
            case 2445:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598030509935694L);
            case 2446:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598030509870157L);
            case 2447:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236931578L);
            case 2448:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236734967L);
            case 2449:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236800504L);
            case 2450:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236866041L);
            case 2451:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794945389270L);
            case 2453:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594959608842227L);
            case 2454:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595354745243775L);
            case 2455:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598077754182749L);
            case 2456:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598064869280852L);
            case 2457:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794945454807L);
            case 2458:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597738452552604L);
            case 2459:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597738452618141L);
            case 2461:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598064869346389L);
            case 2462:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927061414L);
            case 2463:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759926864804L);
            case 2464:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759926930341L);
            case 2466:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454257265096L);
            case 2467:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214159554L);
            default:
                return null;
        }
    }

    private Long A0T(int i) {
        switch (i) {
            case 2469:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594422737929944L);
            case 2470:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595852961188110L);
            case 2472:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597592423271263L);
            case 2473:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081984356602L);
            case 2475:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598116408888422L);
            case 2477:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594508636751600L);
            case 2488:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387650614507L);
            case 2489:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271689118746L);
            case 2492:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804989495132L);
            case 2494:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501502298633L);
            case 2495:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501502036486L);
            case 2496:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501502102023L);
            case 2497:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501502167560L);
            case 2498:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596110660667717L);
            case 2499:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598159358561396L);
            case 2500:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598180833397891L);
            case 2501:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598180833528964L);
            case 2502:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592455642317364L);
            case 2503:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454257723849L);
            case 2504:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454257789386L);
            case 2506:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593443492529461L);
            case 2507:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214094017L);
            case 2508:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592086280110352L);
            case 2509:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804989560669L);
            case 2510:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804989626206L);
            case 2517:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837237062652L);
            case 2518:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837236997115L);
            case 2519:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979629638442L);
            case 2520:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979629703979L);
            case 2522:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349001413816L);
            case 2528:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595195831453769L);
            case 2529:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595195831519306L);
            case 2530:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595127112370213L);
            case 2532:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592863664800482L);
            case 2533:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593499319829843L);
            case 2535:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598331157318842L);
            case 2536:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598331157253305L);
            case 2537:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598331157384379L);
            case 2538:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595728407202036L);
            case 2540:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598313977384105L);
            case 2541:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979629769516L);
            case 2543:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593336111334515L);
            case 2544:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593336111400052L);
            case 2546:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501502495242L);
            case 2547:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372653607331L);
            case 2549:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597326135036698L);
            case 2552:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372653672868L);
            case 2557:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595195831650379L);
            case 2558:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595195831715916L);
            case 2559:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257416805125L);
            case 2560:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598331157449916L);
            case 2561:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288207711370L);
            case 2562:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593499319895380L);
            case 2563:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598421351566540L);
            case 2569:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598404171697350L);
            case 2571:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112047030578L);
            case 2574:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804989691743L);
            case 2575:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804989757280L);
            case 2577:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501502560779L);
            case 2579:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593301751530582L);
            case 2580:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595706933283057L);
            case 2581:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598442826534101L);
            case 2583:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598442826468564L);
            case 2588:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927126951L);
            case 2592:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592185061146975L);
            case 2594:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596449962887617L);
            case 2595:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596943883274943L);
            case 2596:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596943883340480L);
            case 2597:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598515840847064L);
            case 2598:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598408466664647L);
            case 2601:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501502757390L);
            case 2602:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501502626316L);
            case 2603:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501502691853L);
            case 2604:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598554495552737L);
            case 2605:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501502822927L);
            case 2606:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598537315683548L);
            case 2607:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598537315749085L);
            case 2608:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175084063075L);
            case 2609:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175084128612L);
            case 2610:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349001610425L);
            case 2614:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593499320550741L);
            case 2615:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288207776907L);
            case 2616:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288207842444L);
            case 2617:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598593150258409L);
            case 2618:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598064869411926L);
            case 2619:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598064869477463L);
            case 2623:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598348337253567L);
            case 2624:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598348337319104L);
            case 2625:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598348337122494L);
            case 2627:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837237324797L);
            case 2628:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837237390334L);
            case 2629:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837237455871L);
            case 2632:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595625328183503L);
            case 2633:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598571675421928L);
            case 2634:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598567380454629L);
            case 2635:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598567380520166L);
            case 2637:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927192488L);
            case 2638:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927258025L);
            case 2639:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927323562L);
            case 2645:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596905228438198L);
            case 2646:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349001675962L);
            case 2650:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598356927057089L);
            case 2651:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598356927122626L);
            case 2653:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592983927554889L);
            case 2654:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598618920062189L);
            case 2655:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349001741499L);
            case 2656:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592116340490562L);
            case 2658:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596351177722258L);
            case 2659:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596351177787795L);
            case 2660:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596351177853332L);
            case 2662:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387650811116L);
            case 2663:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387650876653L);
            case 2664:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387651007727L);
            case 2665:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593387650942190L);
            case 2666:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452076107077L);
            case 2667:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593452076172614L);
            case 2668:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598378401893573L);
            case 2669:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598623215095022L);
            case 2670:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598537315814622L);
            case 2672:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598563085487330L);
            case 2674:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454258444748L);
            case 2675:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454257985995L);
            case 2676:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454258510285L);
            case 2677:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598666164702455L);
            case 2678:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349001872573L);
            case 2679:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349001807036L);
            case 2680:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598661869735158L);
            case 2681:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112047161651L);
            case 2682:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777766765255L);
            case 2683:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636758783390L);
            case 2684:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636758848927L);
            case 2687:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636759176609L);
            case 2689:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636759045536L);
            case 2690:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636758717853L);
            case 2691:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598713409342728L);
            case 2695:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593258801595385L);
            case 2697:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597472164514626L);
            case 2698:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592081985011963L);
            case 2699:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598726294244617L);
            case 2700:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598726294310154L);
            case 2701:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594268119631528L);
            case 2702:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598786423852315L);
            case 2703:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594804989822817L);
            case 2705:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598782128819482L);
            case 2706:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598790719016224L);
            case 2707:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598790719081761L);
            case 2708:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598790719147298L);
            case 2709:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598790718754076L);
            case 2710:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598790718819613L);
            case 2711:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598790718885150L);
            case 2712:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598790718950687L);
            case 2713:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597472164580163L);
            case 2714:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597472164645700L);
            case 2717:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372653738405L);
            case 2718:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598812193590564L);
            case 2719:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454258706894L);
            case 2724:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596943883406017L);
            case 2725:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596943883471554L);
            case 2726:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596943883537091L);
            case 2727:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596943883602628L);
            case 2728:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596943883668165L);
            case 2729:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451350168068L);
            case 2731:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636759831973L);
            case 2732:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636759635363L);
            case 2733:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636759438754L);
            case 2734:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636759700900L);
            case 2735:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598842258361642L);
            case 2736:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595857256220945L);
            case 2739:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043326832800L);
            case 2740:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592043326767263L);
            case 2741:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927454635L);
            default:
                return null;
        }
    }

    private Long A0U(int i) {
        switch (i) {
            case 2742:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598876618100020L);
            case 2746:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592794945520344L);
            case 2747:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594422737995481L);
            case 2748:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593804261983739L);
            case 2749:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595852961253647L);
            case 2752:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837237718016L);
            case 2755:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271689249820L);
            case 2756:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257416936198L);
            case 2757:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257417001735L);
            case 2758:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288207973517L);
            case 2763:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837237783553L);
            case 2766:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599009762086235L);
            case 2768:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599082776530310L);
            case 2769:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257417067272L);
            case 2770:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372653935014L);
            case 2771:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451350233605L);
            case 2772:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599112841301432L);
            case 2773:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596110660798790L);
            case 2774:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596110660864327L);
            case 2775:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636760028584L);
            case 2777:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636759963047L);
            case 2778:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636759897510L);
            case 2779:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594422738126554L);
            case 2781:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599164381433286L);
            case 2782:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599164381105601L);
            case 2783:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599164381171138L);
            case 2784:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599164381302212L);
            case 2785:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599164381367749L);
            case 2786:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599164380908992L);
            case 2787:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599164381236675L);
            case 2789:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598313977449642L);
            case 2790:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599091366464919L);
            case 2792:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636760094121L);
            case 2793:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979629900589L);
            case 2794:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592979629966126L);
            case 2795:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451350299142L);
            case 2796:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599181560843721L);
            case 2800:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595371925047427L);
            case 2801:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595371925112964L);
            case 2802:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595371925178501L);
            case 2803:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837237849090L);
            case 2804:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837237914627L);
            case 2805:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837237980164L);
            case 2806:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598567380651239L);
            case 2807:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927782320L);
            case 2808:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927847857L);
            case 2809:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927520172L);
            case 2810:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927585709L);
            case 2811:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927651246L);
            case 2812:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927913394L);
            case 2813:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927716783L);
            case 2816:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636760159658L);
            case 2817:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636760225195L);
            case 2818:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636760290732L);
            case 2819:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830763100055L);
            case 2820:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830763165592L);
            case 2822:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596557336021539L);
            case 2823:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271689184283L);
            case 2824:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593207261987823L);
            case 2826:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599233100385744L);
            case 2827:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593847211722245L);
            case 2828:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593894456231440L);
            case 2832:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454258772431L);
            case 2834:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598537315880159L);
            case 2836:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599417783979525L);
            case 2837:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594452802569956L);
            case 2838:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830763558809L);
            case 2839:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454258903504L);
            case 2840:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454258969041L);
            case 2841:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596256688900479L);
            case 2842:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837238045701L);
            case 2843:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593610989438353L);
            case 2844:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314704895463L);
            case 2845:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314704764389L);
            case 2846:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314704829926L);
            case 2848:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599443553783310L);
            case 2849:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599443553848847L);
            case 2850:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599443553914384L);
            case 2851:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599443553979921L);
            case 2852:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599443554110995L);
            case 2853:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599443554045458L);
            case 2854:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599452143717910L);
            case 2858:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482208488996L);
            case 2859:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482208554533L);
            case 2860:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482208620070L);
            case 2861:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482208685607L);
            case 2862:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482208751144L);
            case 2863:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482208816681L);
            case 2865:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482208947754L);
            case 2866:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209013291L);
            case 2867:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209078828L);
            case 2868:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209144365L);
            case 2869:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209209902L);
            case 2870:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209275439L);
            case 2871:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209340976L);
            case 2872:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209406513L);
            case 2875:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598228078103685L);
            case 2876:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598228078169222L);
            case 2877:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598228078234759L);
            case 2879:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495093456442L);
            case 2880:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495093718589L);
            case 2881:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543725115562L);
            case 2882:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596501502888464L);
            case 2883:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543724984488L);
            case 2884:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595543725050025L);
            case 2889:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599361949404668L);
            case 2890:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599361949470205L);
            case 2891:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599361949535742L);
            case 2892:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599361949601279L);
            case 2893:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599361949666816L);
            case 2894:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599361949732353L);
            case 2897:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599598172737109L);
            case 2898:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599598172802646L);
            case 2899:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599598172868183L);
            case 2900:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599598172933720L);
            case 2902:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599598173064793L);
            case 2903:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599598173130330L);
            case 2905:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599628237377123L);
            case 2907:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599649712213606L);
            case 2908:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636760356269L);
            case 2911:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599520863194698L);
            case 2912:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599520863260235L);
            case 2914:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830763689882L);
            case 2915:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830763886492L);
            case 2916:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830764083102L);
            case 2917:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599632532344420L);
            case 2918:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765393828L);
            case 2919:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765459365L);
            case 2920:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765524902L);
            case 2921:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765590439L);
            case 2922:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765655976L);
            case 2923:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765721513L);
            case 2924:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765131680L);
            case 2925:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830759692141L);
            case 2926:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830759757678L);
            case 2927:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765197217L);
            case 2928:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765262754L);
            case 2929:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765328291L);
            case 2931:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495093587516L);
            case 2932:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495093784126L);
            case 2934:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495094046271L);
            case 2935:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495093521979L);
            case 2936:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636760421806L);
            case 2937:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636760487343L);
            case 2938:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592734815519397L);
            case 2941:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765787050L);
            case 2942:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596754904517226L);
            case 2944:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636760618416L);
            case 2945:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592777766896328L);
            case 2946:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599417784110599L);
            case 2947:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599417784045062L);
            case 2948:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759927978931L);
            case 2949:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288208039054L);
            case 2950:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087071628679L);
            case 2951:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087071694216L);
            case 2952:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087071825289L);
            case 2953:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759928044468L);
            case 2954:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766442420L);
            case 2955:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766507957L);
            case 2956:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765852587L);
            case 2957:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766049198L);
            case 2958:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766114735L);
            case 2959:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766180272L);
            case 2960:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765983661L);
            case 2961:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766245809L);
            case 2962:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766311346L);
            case 2963:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766376883L);
            case 2964:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830765918124L);
            case 2965:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591927361404989L);
            case 2966:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209472050L);
            case 2967:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599774266265203L);
            case 2968:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599774266330740L);
            case 2969:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595127112632358L);
            case 2970:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451350561290L);
            case 2971:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451350692364L);
            case 2972:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451350626827L);
            case 2973:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766639030L);
            case 2974:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599885935414924L);
            case 2975:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599885935480461L);
            case 2976:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599885935545998L);
            case 2977:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599885935611535L);
            case 2978:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599885935677072L);
            case 2979:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599885935742609L);
            case 2980:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599885935808146L);
            case 2981:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597257417198345L);
            case 2982:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599907410251413L);
            case 2984:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451350364679L);
            case 2985:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599688366919275L);
            case 2986:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349002527936L);
            case 2987:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349002462399L);
            case 2988:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594916659103716L);
            case 2989:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594916659038179L);
            case 2990:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349002593473L);
            case 2991:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349002659010L);
            case 2995:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759928372149L);
            case 2996:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759928765367L);
            case 2998:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759928568758L);
            case 2999:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599907410316950L);
            case 3000:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600001899597480L);
            case 3001:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600001899531943L);
            case 3002:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175084194149L);
            case 3003:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175084325223L);
            case 3004:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175084456296L);
            case 3005:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599851575676541L);
            case 3006:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599739906526833L);
            case 3007:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288208104591L);
            case 3008:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288208170128L);
            case 3009:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288208235665L);
            case 3010:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288208301202L);
            case 3011:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314704961000L);
            case 3012:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599855870643839L);
            case 3013:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599937475022488L);
            case 3015:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593336111793270L);
            default:
                return null;
        }
    }

    private Long A0V(int i) {
        switch (i) {
            case 3016:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087798877900L);
            case 3017:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087798943437L);
            case 3018:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799008974L);
            case 3019:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799074511L);
            case 3020:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799140048L);
            case 3021:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799205585L);
            case 3022:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799271122L);
            case 3023:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799336659L);
            case 3024:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600087799402196L);
            case 3025:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349002724547L);
            case 3026:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599976129793693L);
            case 3027:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599976129859230L);
            case 3028:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599976129728156L);
            case 3029:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599933180055191L);
            case 3030:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495094439493L);
            case 3031:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495094111808L);
            case 3032:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495094177345L);
            case 3033:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495094242882L);
            case 3034:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495094308419L);
            case 3035:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495094373956L);
            case 3036:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175084521833L);
            case 3037:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271689315357L);
            case 3038:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271689380894L);
            case 3039:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349002396862L);
            case 3040:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451350430216L);
            case 3041:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451350495753L);
            case 3047:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596175084587370L);
            case 3048:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837238242312L);
            case 3049:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837238111238L);
            case 3050:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837238176775L);
            case 3052:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593903046821404L);
            case 3053:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991786242138L);
            case 3063:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079210516159L);
            case 3064:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079209008822L);
            case 3065:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079210450622L);
            case 3066:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079209074359L);
            case 3067:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079209139896L);
            case 3068:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079209205433L);
            case 3069:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079209270970L);
            case 3070:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079209336507L);
            case 3071:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079209402044L);
            case 3074:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079209598653L);
            case 3078:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636760683953L);
            case 3079:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759928961977L);
            case 3080:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759928896440L);
            case 3082:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600062029270707L);
            case 3083:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600062029336244L);
            case 3084:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600062029401781L);
            case 3085:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599087071890826L);
            case 3086:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600062029074096L);
            case 3087:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600062029139633L);
            case 3088:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600062029205170L);
            case 3089:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599654007180903L);
            case 3090:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600126453583586L);
            case 3091:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271689643041L);
            case 3092:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271689511967L);
            case 3093:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271689577504L);
            case 3094:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592056214225091L);
            case 3096:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598159358692469L);
            case 3097:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600147928420075L);
            case 3098:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648027898L);
            case 3099:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648093435L);
            case 3100:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648158972L);
            case 3101:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648224509L);
            case 3102:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648290046L);
            case 3103:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648355583L);
            case 3104:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648421120L);
            case 3105:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648486657L);
            case 3106:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648552194L);
            case 3107:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648617731L);
            case 3108:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648683268L);
            case 3109:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648748805L);
            case 3110:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648814342L);
            case 3111:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648879879L);
            case 3112:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216648945416L);
            case 3113:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216649010953L);
            case 3114:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216649076490L);
            case 3115:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216649142027L);
            case 3116:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216649207564L);
            case 3117:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216649273101L);
            case 3118:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216649338638L);
            case 3119:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216649404175L);
            case 3120:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216649469712L);
            case 3121:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216649535249L);
            case 3122:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216649600786L);
            case 3124:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216649731859L);
            case 3125:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216649797396L);
            case 3127:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216649928469L);
            case 3129:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216647896824L);
            case 3130:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216647962361L);
            case 3131:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636760749490L);
            case 3133:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600263892537143L);
            case 3135:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454259231186L);
            case 3136:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271689708578L);
            case 3137:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596256688966016L);
            case 3138:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596548746086939L);
            case 3139:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766835641L);
            case 3140:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766704567L);
            case 3141:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766770104L);
            case 3142:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766901178L);
            case 3143:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598408466730184L);
            case 3144:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598408466795721L);
            case 3146:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600263892668217L);
            case 3147:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600263892602680L);
            case 3149:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595625328249040L);
            case 3150:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595625328314577L);
            case 3151:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595625328380114L);
            case 3153:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271689839651L);
            case 3154:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271689970724L);
            case 3160:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079210581696L);
            case 3161:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079210647233L);
            case 3163:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636760880563L);
            case 3164:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599834395872891L);
            case 3165:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837238307849L);
            case 3169:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36595638213216475L);
            case 3170:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349002790084L);
            case 3171:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349002855621L);
            case 3172:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991786373211L);
            case 3173:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636761011637L);
            case 3174:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636760946100L);
            case 3175:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600371266719607L);
            case 3176:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600371266785144L);
            case 3177:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600147928485612L);
            case 3178:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271690232870L);
            case 3179:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271690298407L);
            case 3180:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271690560554L);
            case 3181:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271690429480L);
            case 3182:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271690495017L);
            case 3183:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593271690167333L);
            case 3184:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600263892799290L);
            case 3186:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600083504041675L);
            case 3187:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600057734106799L);
            case 3188:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991786438748L);
            case 3189:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596372654000551L);
            case 3190:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593301751858263L);
            case 3191:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36591991786504285L);
            case 3192:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759929093050L);
            case 3193:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592674686042773L);
            case 3194:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599482209537587L);
            case 3195:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598408466861258L);
            case 3196:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598408466926795L);
            case 3197:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837238438922L);
            case 3198:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597837238569995L);
            case 3199:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830766966715L);
            case 3200:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598331157515453L);
            case 3201:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349002921158L);
            case 3202:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349002986695L);
            case 3203:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349003052232L);
            case 3204:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349003117769L);
            case 3205:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349003183306L);
            case 3206:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349003248843L);
            case 3210:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314705354218L);
            case 3211:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314705419755L);
            case 3212:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599314705026537L);
            case 3213:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600409921425274L);
            case 3214:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593499320616278L);
            case 3218:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600147928551149L);
            case 3219:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600147928616686L);
            case 3220:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288208432275L);
            case 3221:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451350888973L);
            case 3222:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349003576525L);
            case 3223:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349003510988L);
            case 3224:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495094505030L);
            case 3225:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495094570567L);
            case 3226:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495094636104L);
            case 3227:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830767032252L);
            case 3228:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830763755419L);
            case 3229:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830763952029L);
            case 3230:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830767097789L);
            case 3231:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594830764148639L);
            case 3233:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759929289661L);
            case 3234:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759929224124L);
            case 3235:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599495094701641L);
            case 3236:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288208497812L);
            case 3237:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288208563349L);
            case 3238:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079210843842L);
            case 3239:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600079210909379L);
            case 3240:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600538770509720L);
            case 3241:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593349003642062L);
            case 3242:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759929158587L);
            case 3243:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600560245280669L);
            case 3244:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759929486270L);
            case 3245:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36597759929551807L);
            case 3246:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600251007635254L);
            case 3249:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636761208246L);
            case 3252:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592112047227188L);
            case 3253:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288208694422L);
            case 3254:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288208759959L);
            case 3256:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351151120L);
            case 3257:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351216657L);
            case 3258:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351020046L);
            case 3259:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36592451351085583L);
            case 3260:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36593636761339319L);
            case 3262:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600646144626624L);
            case 3263:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600646144823233L);
            case 3264:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36594916659169253L);
            case 3266:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600263893061436L);
            case 3267:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600263892995899L);
            case 3268:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599417784176136L);
            case 3269:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599417784241673L);
            case 3270:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680504364997L);
            case 3271:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680504430534L);
            case 3272:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680504496071L);
            case 3273:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680504561608L);
            case 3274:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680504627145L);
            case 3275:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600680504692682L);
            case 3276:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216650125078L);
            case 3277:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36600216650190615L);
            case 3278:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36599443554176532L);
            case 3279:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454259362260L);
            case 3280:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454259427797L);
            case 3281:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454259493334L);
            case 3282:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454259558871L);
            case 3283:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454259624408L);
            case 3284:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454259689945L);
            case 3285:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454259755482L);
            case 3286:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454259821019L);
            case 3287:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454259886556L);
            case 3288:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36596454259952093L);
            case 3289:
                return AnonymousClass7TF.A0Y(0Tu.A06, this.A00, 36598288208825496L);
            default:
                return null;
        }
    }
}
