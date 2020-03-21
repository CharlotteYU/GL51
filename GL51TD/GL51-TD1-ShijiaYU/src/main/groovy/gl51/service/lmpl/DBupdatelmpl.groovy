package gl51.service.lmpl

import gl51.data.Picture
import gl51.service.DBupdateService
import gl51.service.FetchService

import javax.inject.Inject
@Singleton
class DBupdatelmpl implements DBupdateService{

    @Inject FetchService fetchService
    boolean dbupdate() {
        Picture picture = fetchService.fetch()
        def name = picture.name
        def path = picture.path
        //update BD
        return true

    }
}
