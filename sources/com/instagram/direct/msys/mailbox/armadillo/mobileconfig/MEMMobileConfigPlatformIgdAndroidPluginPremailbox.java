package com.instagram.direct.msys.mailbox.armadillo.mobileconfig;

import X.2HR;
import X.C3030467e;
import X.C355538Qj;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;
import com.instagram.react.modules.base.IgReactQEModule;

public final class MEMMobileConfigPlatformIgdAndroidPluginPremailbox extends Premailbox {
    public void MEMMobileConfigPlatformIgdAndroidPluginPremailboxExtensionsDestroy() {
    }

    public String MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformCopyString(int i, String str, boolean z) {
        2HR r0;
        Object A00;
        if (i == 555) {
            return "igdMobile";
        }
        if (i == 560) {
            r0 = C3030467e.A00(this.mAppContext.userSession).A1p;
        } else if (i != 561) {
            return str;
        } else {
            r0 = C3030467e.A00(this.mAppContext.userSession).A1w;
        }
        if (z) {
            A00 = r0.get();
        } else {
            A00 = r0.A00();
        }
        return (String) A00;
    }

    public boolean MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetBoolean(int i, boolean z, boolean z2) {
        2HR r0;
        Object A00;
        if (i == 24) {
            r0 = C3030467e.A00(this.mAppContext.userSession).A09;
        } else if (i == 25) {
            return false;
        } else {
            if (i == 28) {
                r0 = C3030467e.A00(this.mAppContext.userSession).A0B;
            } else if (i == 29) {
                r0 = C3030467e.A00(this.mAppContext.userSession).A0C;
            } else if (i == 49) {
                r0 = C3030467e.A00(this.mAppContext.userSession).A0E;
            } else if (i == 50) {
                r0 = C3030467e.A00(this.mAppContext.userSession).A0F;
            } else if (i == 103) {
                r0 = C3030467e.A00(this.mAppContext.userSession).A0S;
            } else if (i == 104) {
                return true;
            } else {
                if (i == 116) {
                    r0 = C3030467e.A00(this.mAppContext.userSession).A0V;
                } else if (i != 117) {
                    switch (i) {
                        case 5:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A00;
                            break;
                        case 8:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A01;
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A04;
                            break;
                        case 15:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A08;
                            break;
                        case 17:
                        case 192:
                        case 318:
                        case 323:
                        case 331:
                        case 332:
                        case 384:
                        case 385:
                        case 402:
                        case 433:
                            return false;
                        case 34:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0D;
                            break;
                        case 56:
                        case 79:
                        case 80:
                        case 151:
                        case 166:
                        case 202:
                        case 316:
                        case 317:
                        case 320:
                        case 396:
                        case 439:
                            return true;
                        case 60:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0H;
                            break;
                        case 76:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0I;
                            break;
                        case 77:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0K;
                            break;
                        case 78:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0J;
                            break;
                        case 81:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0L;
                            break;
                        case 86:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0M;
                            break;
                        case 89:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0N;
                            break;
                        case 109:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0T;
                            break;
                        case 111:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0U;
                            break;
                        case 119:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0X;
                            break;
                        case 149:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0j;
                            break;
                        case 150:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0i;
                            break;
                        case 152:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0k;
                            break;
                        case 154:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0l;
                            break;
                        case 155:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0m;
                            break;
                        case 156:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0n;
                            break;
                        case 161:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0o;
                            break;
                        case 163:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0p;
                            break;
                        case 164:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0q;
                            break;
                        case 167:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0r;
                            break;
                        case 169:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0s;
                            break;
                        case 185:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0t;
                            break;
                        case 188:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0u;
                            break;
                        case 190:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0v;
                            break;
                        case 195:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0w;
                            break;
                        case 198:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0x;
                            break;
                        case 208:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A0z;
                            break;
                        case 210:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A10;
                            break;
                        case 211:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A11;
                            break;
                        case 212:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A12;
                            break;
                        case 217:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A13;
                            break;
                        case 222:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A14;
                            break;
                        case 227:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A15;
                            break;
                        case 232:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A16;
                            break;
                        case 235:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A17;
                            break;
                        case 236:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A18;
                            break;
                        case 240:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A19;
                            break;
                        case 241:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1A;
                            break;
                        case 242:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1B;
                            break;
                        case 246:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1C;
                            break;
                        case 247:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1D;
                            break;
                        case 249:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1E;
                            break;
                        case C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION /*250*/:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1F;
                            break;
                        case 252:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1G;
                            break;
                        case 258:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1H;
                            break;
                        case 259:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1I;
                            break;
                        case 260:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1J;
                            break;
                        case 262:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1K;
                            break;
                        case 263:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1L;
                            break;
                        case 267:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1M;
                            break;
                        case 268:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1N;
                            break;
                        case 272:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1O;
                            break;
                        case 274:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1P;
                            break;
                        case 286:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1Q;
                            break;
                        case 288:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1R;
                            break;
                        case 289:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1S;
                            break;
                        case 290:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1V;
                            break;
                        case 291:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1X;
                            break;
                        case 292:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1Z;
                            break;
                        case 293:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1a;
                            break;
                        case 294:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1b;
                            break;
                        case 295:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1c;
                            break;
                        case 296:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1d;
                            break;
                        case 297:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1e;
                            break;
                        case 298:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1f;
                            break;
                        case 299:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1g;
                            break;
                        case 300:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1h;
                            break;
                        case 301:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1i;
                            break;
                        case 306:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1j;
                            break;
                        case 307:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1k;
                            break;
                        case 308:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1l;
                            break;
                        case 309:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1m;
                            break;
                        case 310:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1n;
                            break;
                        case 311:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1o;
                            break;
                        case 312:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1q;
                            break;
                        case 313:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1r;
                            break;
                        case 314:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1s;
                            break;
                        case 315:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1t;
                            break;
                        case 322:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1u;
                            break;
                        case 334:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1v;
                            break;
                        case 353:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A1z;
                            break;
                        case 378:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A24;
                            break;
                        case 383:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A26;
                            break;
                        case 386:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A27;
                            break;
                        case 388:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A29;
                            break;
                        case 408:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A2F;
                            break;
                        case 417:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A2L;
                            break;
                        case 420:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A2M;
                            break;
                        case 421:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A2N;
                            break;
                        case 422:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A2P;
                            break;
                        case 430:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A2Q;
                            break;
                        case 431:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A2S;
                            break;
                        case 432:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A2R;
                            break;
                        case 435:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A2T;
                            break;
                        case 438:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A2U;
                            break;
                        case 440:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A2V;
                            break;
                        case 441:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A2X;
                            break;
                        case 442:
                            r0 = C3030467e.A00(this.mAppContext.userSession).A2Y;
                            break;
                        default:
                            switch (i) {
                                case 94:
                                    r0 = C3030467e.A00(this.mAppContext.userSession).A0O;
                                    break;
                                case 95:
                                case 97:
                                    return false;
                                case 96:
                                    r0 = C3030467e.A00(this.mAppContext.userSession).A0P;
                                    break;
                                case 98:
                                    r0 = C3030467e.A00(this.mAppContext.userSession).A0Q;
                                    break;
                                case 99:
                                    r0 = C3030467e.A00(this.mAppContext.userSession).A0R;
                                    break;
                                default:
                                    switch (i) {
                                        case 121:
                                            r0 = C3030467e.A00(this.mAppContext.userSession).A0Y;
                                            break;
                                        case 122:
                                            r0 = C3030467e.A00(this.mAppContext.userSession).A0Z;
                                            break;
                                        case 123:
                                            r0 = C3030467e.A00(this.mAppContext.userSession).A0a;
                                            break;
                                        case 124:
                                            r0 = C3030467e.A00(this.mAppContext.userSession).A0b;
                                            break;
                                        default:
                                            switch (i) {
                                                case 135:
                                                    r0 = C3030467e.A00(this.mAppContext.userSession).A0c;
                                                    break;
                                                case 136:
                                                    r0 = C3030467e.A00(this.mAppContext.userSession).A0d;
                                                    break;
                                                case 137:
                                                    r0 = C3030467e.A00(this.mAppContext.userSession).A0e;
                                                    break;
                                                case 138:
                                                    r0 = C3030467e.A00(this.mAppContext.userSession).A0f;
                                                    break;
                                                case 139:
                                                    r0 = C3030467e.A00(this.mAppContext.userSession).A0g;
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 141:
                                                        case 143:
                                                            return false;
                                                        case 142:
                                                            r0 = C3030467e.A00(this.mAppContext.userSession).A0h;
                                                            break;
                                                        default:
                                                            return z;
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    r0 = C3030467e.A00(this.mAppContext.userSession).A0W;
                }
            }
        }
        if (z2) {
            A00 = r0.get();
        } else {
            A00 = r0.A00();
        }
        return ((Boolean) A00).booleanValue();
    }

    public double MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetDouble(int i, double d, boolean z) {
        2HR r0;
        Object A00;
        if (i == 443) {
            r0 = C3030467e.A00(this.mAppContext.userSession).A1y;
        } else if (i != 450) {
            return d;
        } else {
            r0 = C3030467e.A00(this.mAppContext.userSession).A2G;
        }
        if (z) {
            A00 = r0.get();
        } else {
            A00 = r0.A00();
        }
        return ((Number) A00).doubleValue();
    }

    public int MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetInt32(int i, int i2, boolean z) {
        2HR r0;
        Object A00;
        if (i == 457) {
            r0 = C3030467e.A00(this.mAppContext.userSession).A02;
        } else if (i == 458) {
            r0 = C3030467e.A00(this.mAppContext.userSession).A03;
        } else if (i == 461) {
            return 16;
        } else {
            if (i != 462) {
                switch (i) {
                    case 465:
                        r0 = C3030467e.A00(this.mAppContext.userSession).A06;
                        break;
                    case 478:
                        r0 = C3030467e.A00(this.mAppContext.userSession).A07;
                        break;
                    case 483:
                        r0 = C3030467e.A00(this.mAppContext.userSession).A0A;
                        break;
                    case 491:
                        r0 = C3030467e.A00(this.mAppContext.userSession).A0G;
                        break;
                    case 505:
                        r0 = C3030467e.A00(this.mAppContext.userSession).A1x;
                        break;
                    case 514:
                        return 0;
                    case 523:
                        r0 = C3030467e.A00(this.mAppContext.userSession).A25;
                        break;
                    case 525:
                        r0 = C3030467e.A00(this.mAppContext.userSession).A28;
                        break;
                    case 534:
                        r0 = C3030467e.A00(this.mAppContext.userSession).A2E;
                        break;
                    case 537:
                        r0 = C3030467e.A00(this.mAppContext.userSession).A2H;
                        break;
                    case 546:
                        r0 = C3030467e.A00(this.mAppContext.userSession).A2W;
                        break;
                    default:
                        switch (i) {
                            case 496:
                                r0 = C3030467e.A00(this.mAppContext.userSession).A1T;
                                break;
                            case 497:
                                r0 = C3030467e.A00(this.mAppContext.userSession).A1U;
                                break;
                            case 498:
                                r0 = C3030467e.A00(this.mAppContext.userSession).A1Y;
                                break;
                            default:
                                switch (i) {
                                    case 516:
                                        r0 = C3030467e.A00(this.mAppContext.userSession).A20;
                                        break;
                                    case 517:
                                        r0 = C3030467e.A00(this.mAppContext.userSession).A21;
                                        break;
                                    case 518:
                                        r0 = C3030467e.A00(this.mAppContext.userSession).A22;
                                        break;
                                    case 519:
                                        r0 = C3030467e.A00(this.mAppContext.userSession).A23;
                                        break;
                                    default:
                                        switch (i) {
                                            case 528:
                                                r0 = C3030467e.A00(this.mAppContext.userSession).A2A;
                                                break;
                                            case 529:
                                                r0 = C3030467e.A00(this.mAppContext.userSession).A2B;
                                                break;
                                            case 530:
                                                r0 = C3030467e.A00(this.mAppContext.userSession).A2C;
                                                break;
                                            case 531:
                                                r0 = C3030467e.A00(this.mAppContext.userSession).A2D;
                                                break;
                                            default:
                                                switch (i) {
                                                    case 539:
                                                        r0 = C3030467e.A00(this.mAppContext.userSession).A2I;
                                                        break;
                                                    case 540:
                                                        r0 = C3030467e.A00(this.mAppContext.userSession).A2J;
                                                        break;
                                                    case 541:
                                                        r0 = C3030467e.A00(this.mAppContext.userSession).A2K;
                                                        break;
                                                    case 542:
                                                        r0 = C3030467e.A00(this.mAppContext.userSession).A2O;
                                                        break;
                                                    case 543:
                                                        return 1;
                                                    default:
                                                        return i2;
                                                }
                                        }
                                }
                        }
                }
            } else {
                r0 = C3030467e.A00(this.mAppContext.userSession).A05;
            }
        }
        if (z) {
            A00 = r0.get();
        } else {
            A00 = r0.A00();
        }
        return (int) ((Number) A00).longValue();
    }

    public long MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetInt64(int i, long j, boolean z) {
        2HR r0;
        Object A00;
        if (i == 549) {
            r0 = C3030467e.A00(this.mAppContext.userSession).A0y;
        } else if (i != 550) {
            return j;
        } else {
            r0 = C3030467e.A00(this.mAppContext.userSession).A1W;
        }
        if (z) {
            A00 = r0.get();
        } else {
            A00 = r0.A00();
        }
        return ((Number) A00).longValue();
    }

    public MEMMobileConfigPlatformIgdAndroidPluginPremailbox(MsysActiveUserSession msysActiveUserSession) {
        super(msysActiveUserSession);
    }
}
