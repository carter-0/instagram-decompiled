package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.0qQ;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C48116EWi;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundSignalsQueryResponseImpl extends C250663lr implements CreatorInspirationSignalsPlaygroundSignalsQueryResponse {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -1561692376;

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundSignalsQueryResponseImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final class XdtGetCreatorsSignalPlayground extends C250663lr implements CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -2104072711;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return XdtGetCreatorsSignalPlayground.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class Signals extends C250663lr implements CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -350141370;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Signals.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getDisplayName() {
                return A08("display_name");
            }

            public C48116EWi getEntityTypeV2() {
                return (C48116EWi) getOptionalEnumField(2, "entity_type_v2", C48116EWi.A02);
            }

            public String getIdentifier() {
                return A07("identifier");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                return AnonymousClass7TG.A0U(r3, AnonymousClass7TE.A0f(r3, "identifier"), AnonymousClass7TE.A0f(r3, "display_name"), "entity_type_v2");
            }

            public Signals(int i) {
                super(i);
            }

            public Signals() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public ImmutableList getSignals() {
            return getOptionalCompactedTreeListField(0, "signals", Signals.class, Signals.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            int i = Signals.TYPE_TAG;
            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Signals.class, "signals", i);
        }

        public XdtGetCreatorsSignalPlayground(int i) {
            super(i);
        }

        public XdtGetCreatorsSignalPlayground() {
            super(TYPE_TAG);
        }
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground getXdtGetCreatorsSignalPlayground() {
        C250663lr A05 = A05(XdtGetCreatorsSignalPlayground.class, "xdt_get_creators_signal_playground", XdtGetCreatorsSignalPlayground.TYPE_TAG);
        0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponseImpl.XdtGetCreatorsSignalPlayground");
        return (XdtGetCreatorsSignalPlayground) A05;
    }

    public AnonymousClass4Kx modelSelectionSet() {
        int i = XdtGetCreatorsSignalPlayground.TYPE_TAG;
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtGetCreatorsSignalPlayground.class, "xdt_get_creators_signal_playground", i);
    }

    public CreatorInspirationSignalsPlaygroundSignalsQueryResponseImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundSignalsQueryResponseImpl() {
        super(TYPE_TAG);
    }
}
