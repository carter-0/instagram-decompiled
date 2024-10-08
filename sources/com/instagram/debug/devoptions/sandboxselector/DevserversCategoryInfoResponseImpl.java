package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.AnonymousClass4Kp;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4LF;
import X.AnonymousClass7TG;
import X.C11152SCh;
import X.C250663lr;
import X.C41845B3m;
import X.C41847B3o;
import X.C66579MXk;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DevserversCategoryInfoResponseImpl extends C250663lr implements DevserversCategoryInfoResponse {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -916097597;

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return DevserversCategoryInfoResponseImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final class XdtApiV1DevserversListCategorized extends C250663lr implements DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -93079582;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return XdtApiV1DevserversListCategorized.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class DevserverCategories extends C250663lr implements DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 814671409;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return DevserverCategories.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class DevserverInfos extends C250663lr implements DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories.DevserverInfos {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 1467968093;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return DevserverInfos.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public String getHostType() {
                    return C41847B3o.A1A(this, DevServerEntity.COLUMN_HOST_TYPE, 1);
                }

                public String getUrl() {
                    return C41847B3o.A1A(this, "url", 2);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getDescription() {
                    return A07(DevServerEntity.COLUMN_DESCRIPTION);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0U(AnonymousClass4Kz.A01(), new AnonymousClass4L7(AnonymousClass4Kz.A00, DevServerEntity.COLUMN_DESCRIPTION), new AnonymousClass4L7(AnonymousClass4Kz.A01(), DevServerEntity.COLUMN_HOST_TYPE), "url");
                }

                public DevserverInfos(int i) {
                    super(i);
                }

                public DevserverInfos() {
                    super(TYPE_TAG);
                }
            }

            public String getName() {
                return C41847B3o.A1A(this, "strong_id__", 1);
            }

            public boolean getSupportsVpnless() {
                return getRequiredBooleanField(2, C66579MXk.A00(C11152SCh.MAX_FACTORIAL));
            }

            public boolean hasSupportsVpnless() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public ImmutableList getDevserverInfos() {
                return A06(DevserverInfos.class, "devserver_infos", DevserverInfos.TYPE_TAG);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                int i = DevserverInfos.TYPE_TAG;
                return AnonymousClass7TG.A0U(AnonymousClass4LF.A00(), new AnonymousClass4Kp(AnonymousClass4Ks.A02(), DevserverInfos.class, "devserver_infos", i), C41845B3m.A0G(AnonymousClass4Kz.A01()), C66579MXk.A00(C11152SCh.MAX_FACTORIAL));
            }

            public DevserverCategories(int i) {
                super(i);
            }

            public DevserverCategories() {
                super(TYPE_TAG);
            }
        }

        public ImmutableList getErrorMessages() {
            return getRequiredCompactedStringListField(1, "error_messages");
        }

        public boolean hasIsInternal() {
            return true;
        }

        public boolean isInternal() {
            return getRequiredBooleanField(2, "is_internal");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public ImmutableList getDevserverCategories() {
            return A06(DevserverCategories.class, "devserver_categories", DevserverCategories.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            int i = DevserverCategories.TYPE_TAG;
            return AnonymousClass7TG.A0U(AnonymousClass4LF.A00(), new AnonymousClass4Kp(AnonymousClass4Ks.A02(), DevserverCategories.class, "devserver_categories", i), new AnonymousClass4L7(AnonymousClass4Kz.A02(), "error_messages"), "is_internal");
        }

        public XdtApiV1DevserversListCategorized(int i) {
            super(i);
        }

        public XdtApiV1DevserversListCategorized() {
            super(TYPE_TAG);
        }
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized getXdtApiV1DevserversListCategorized() {
        C250663lr A05 = A05(XdtApiV1DevserversListCategorized.class, C66579MXk.A00(411), XdtApiV1DevserversListCategorized.TYPE_TAG);
        0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponseImpl.XdtApiV1DevserversListCategorized");
        return (XdtApiV1DevserversListCategorized) A05;
    }

    public AnonymousClass4Kx modelSelectionSet() {
        int i = XdtApiV1DevserversListCategorized.TYPE_TAG;
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtApiV1DevserversListCategorized.class, C66579MXk.A00(411), i);
    }

    public DevserversCategoryInfoResponseImpl(int i) {
        super(i);
    }

    public DevserversCategoryInfoResponseImpl() {
        super(TYPE_TAG);
    }
}
