package transport;

import java.util.List;
import java.util.Queue;

public class ServiceStation {
    private Queue <Transport> queue;

    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }
    public void addTransport(Transport transport) {
        if (transport.checkTransportNeedService())
            queue.add(transport);
    }
    public void technicalInspectionCar() {
        if (!queue.isEmpty()) {
            Transport transport = queue.poll();
            transport.repair();
        }
    }
    public void carryOutAVehicleInspection(Queue<Transport> queue) {
        if (queue.isEmpty()) {
            System.out.println("У данного транспортного средства нет механиков");
        } else {
            while (!queue.isEmpty()){
                Transport currentTransport = queue.poll();
                List<Mechanic> mechanics = currentTransport.getMechanicList();
                for (Mechanic mechanic : mechanics) {
                    mechanic.toDiagnose(currentTransport);
                }
            }
        }
    }
}
