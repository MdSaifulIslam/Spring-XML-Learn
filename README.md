## Problems or may be solved
> Frontend are not included.</br>
> User role solved manually, can be solved by JWT.</br>
> Whether user is active or not, can be solved by JWT.</br>

# API details:

## For login
> **url** : /api/all/auth</br>
> **method** : post </br>
> **body** : Raw, Json, {
    "username" : "user1",
    "password" : "pass"
}</br>
> **response** : {
    "email" : "",
    "accessToken" : ""
}


## For getting all users
> **url** : /api/admin/users</br>
> **method** : get </br>
> **Header** : Authorization : Bearer Toekn </br>
> **response** : List of all useres, including active and not

## For getting approved or disapproved users list</br>
### admin will call /api/admin/users/true for approved users
### admin will call /api/admin/users/fasle for disapproved users
> **url** : /api/admin/users/{approve}</br>
> **method** : get </br>
**Header** : Authorization : Bearer Toekn </br>
> **response** : List of approved or disapproved users
